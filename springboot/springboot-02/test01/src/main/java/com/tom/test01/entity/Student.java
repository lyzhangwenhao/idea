package com.tom.test01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * ClassName: Student
 * Description:
 *
 * @date 2019/11/1 15:15
 * @author: Mi_dad
 */
@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
@Table
public class Student implements Serializable {
    @Id
    private Integer stuId;
    private String stuName;
    private Integer stuAge;
    private String stuAddress;

}
