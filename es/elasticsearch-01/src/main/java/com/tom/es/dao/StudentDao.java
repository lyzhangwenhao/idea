package com.tom.es.dao;

import com.tom.es.entity.Student;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * ClassName: StudentDao
 * Description:
 *
 * @date 2019/10/30 16:23
 * @author: Mi_dad
 */
@Repository
public interface StudentDao extends ElasticsearchCrudRepository<Student,Integer> {

}
