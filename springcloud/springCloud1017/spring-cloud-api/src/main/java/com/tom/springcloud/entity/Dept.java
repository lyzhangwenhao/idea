package com.tom.springcloud.entity;

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
 * @date 2019/10/17 19:36
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long  deptNo;   //主键
    private String  deptName;   //部门名称
    private String  dbSource;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String deptName)
    {
        super();
        this.deptName = deptName;
    }
}
