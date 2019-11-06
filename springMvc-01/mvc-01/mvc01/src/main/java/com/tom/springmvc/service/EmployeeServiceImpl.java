package com.tom.springmvc.service;

import com.tom.springmvc.dao.EmployeeDao;
import com.tom.springmvc.dao.EmployeeDaoImpl;
import com.tom.springmvc.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: EmployeeServiceImpl
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/9 13:18
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao = new EmployeeDaoImpl();

    @Autowired
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> findAllEmployee() {
        List<Employee> allEmployee = employeeDao.findAllEmployee();
        return allEmployee;
    }

    /**
     * 通过Id删除employee信息
     *
     * @param id
     */
    @Override
    public void deleteEmployeeById(String id) {
        employeeDao.deleteEmployeeById(id);
    }

    /**
     * 添加employee
     *
     * @param employee
     */
    @Override
    public void addEmployee(Employee employee) {
        employeeDao.addEmployee(employee);
    }
}
