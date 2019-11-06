package com.tom.es;

import com.tom.es.dao.StudentDao;
import com.tom.es.entity.Student;
import org.elasticsearch.client.transport.TransportClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import java.util.Iterator;

@SpringBootTest
class Elasticsearch01ApplicationTests {

    @Autowired
    TransportClient transportClient;

    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;


    @Test
    void contextLoads() {
    }

    /**
     * 创建索引
     */
    @Test
    public void creatIndex(){
        boolean creatFlag = elasticsearchTemplate.createIndex(Student.class);
        boolean putFlag = elasticsearchTemplate.putMapping(Student.class);
        if (creatFlag&&putFlag){
            System.out.println("索引创建成功");
        }else {
            System.out.println("索引创建失败");
        }
    }

    @Autowired
    StudentDao studentDao;
    /**
     * 添加文档
     */
    @Test
    public void add(){
        Student student = new Student();
        student.setStuId(2);
        student.setStuName("李四");
        student.setStuAge("456");
        student.setStuAddress("上海");
        studentDao.save(student);
        Iterable<Student> all = studentDao.findAll();
        Iterator<Student> iterator = all.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }

}
