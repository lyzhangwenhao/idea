package com.tom.springmvc.service;

import com.tom.springmvc.entity.Employee;

import java.util.List;

/**
 * ClassName: EmployeeService
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/9 13:18
 */
public interface EmployeeService {
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
