package com.tom.springmvc.entity;

import org.springframework.stereotype.Component;

/**
 * ClassName: Employee
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/9 13:19
 */
@Component
public class Employee {
    private Integer empId;
    private String empName;
    private String empGender;
    private Integer empAge;

    private Integer deptId;

    public Employee() {
    }

    public Employee(Integer empId, String empName, String empGender, Integer empAge, Integer deptId) {
        this.empId = empId;
        this.empName = empName;
        this.empGender = empGender;
        this.empAge = empAge;
        this.deptId = deptId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empGender='" + empGender + '\'' +
                ", empAge=" + empAge +
                ",deptId="+ deptId +
                '}';
    }
}
