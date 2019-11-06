package com.tom.springmvc.dao;

import com.tom.springmvc.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName: EmployeeDaoImpl
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/9 13:19
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Employee> findAllEmployee() {
        String sql= "select * from employee";
        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    /**
     * 通过Id删除employee信息
     *
     * @param id
     */
    @Override
    public void deleteEmployeeById(String id) {
        String sql = "delete from employee where emp_id = ?";
        jdbcTemplate.update(sql,id);
    }

    /**
     * 添加employee
     *
     * @param employee
     */
    @Override
    public void addEmployee(Employee employee) {
        String sql = "insert into employee values(null,?,?,?,?)";

        System.out.println(employee);
        jdbcTemplate.update(sql,employee.getEmpName(),employee.getEmpGender(),
                employee.getEmpAge(),employee.getDeptId());

    }
}
