package com.tom.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * ClassName: Dept
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/17 23:47
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private Integer deptNo;
    private String deptName;
    private String  dbSource;

    public Dept(String deptName) {
        this.deptName = deptName;
    }
}
