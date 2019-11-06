package com.tom.springmvc.entity;

import org.springframework.stereotype.Component;

/**
 * ClassName: Dept
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/9 13:54
 */
@Component
public class Dept {
    private Integer deptId;
    private String deptName;

    public Dept() {
    }

    public Dept(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                '}';
    }
}
