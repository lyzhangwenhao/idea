package com.tom.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * ClassName: Student
 * Description:
 *
 * @date 2019/10/31 14:46
 * @author: Mi_dad
 */
@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Student implements Serializable {
    private Integer stuId;
    private String stuName;
    private Integer stuAge;
    private String stuAddress;

}
