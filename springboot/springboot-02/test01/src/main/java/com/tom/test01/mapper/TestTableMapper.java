package com.tom.test01.mapper;

import com.tom.test01.entity.Student;
import tk.mybatis.mapper.common.Mapper;

/**
 * ClassName: TestTableMapper
 * Description:
 *
 * @date 2019/11/1 20:42
 * @author: Mi_dad
 */
@org.apache.ibatis.annotations.Mapper
public interface TestTableMapper extends Mapper<Student> {
}
