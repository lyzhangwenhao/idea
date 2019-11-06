package com.tom.springmvc.dao;

import com.tom.springmvc.entity.Employee;

import java.util.List;

/**
 * ClassName: EmployeeDao
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/9 13:19
 */
public interface EmployeeDao {
    /**
     * 查找所有employee
     *
     * @return
     */
    List<Employee> findAllEmployee();

    /**
     * 通过Id删除employee信息
     * @param id
     */
    void deleteEmployeeById(String id);

    /**
     * 添加employee
     * @param employee
     */
    void addEmployee(Employee employee);
}
