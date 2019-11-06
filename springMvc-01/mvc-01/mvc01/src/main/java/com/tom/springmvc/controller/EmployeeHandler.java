package com.tom.springmvc.controller;

import com.tom.springmvc.entity.Employee;
import com.tom.springmvc.service.EmployeeService;
import com.tom.springmvc.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * ClassName: EmployeeHandler
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/9 11:22
 */
@Controller
public class EmployeeHandler {


    private EmployeeService employeeService ;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * 跳转到添加页面
     * @return
     */
    @RequestMapping(value = "/emp",method = RequestMethod.GET)
    public String insertEmployee(Model model){
        model.addAttribute("command",new Employee());
        return "input";
    }

    /**
     * 进行添加操作
     * @param employee
     * @return
     */
    @RequestMapping(value = "/emp",method = RequestMethod.POST)
    public String addEmployee(Employee employee){
        employeeService.addEmployee(employee);
        return "redirect:/findAllEmployee";
    }

    /**
     * 删除单个employee
     * @param id
     * @return
     */
    @RequestMapping(value = "/emp/{id}",method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id")String id){
        employeeService.deleteEmployeeById(id);
        return "redirect:/findAllEmployee";
    }

    /**
     * 显示所有员工信息
     * @param model
     * @return
     */
    @RequestMapping(value = "/findAllEmployee",method = RequestMethod.GET)
    public String findAllEmployee(Model model){
        List<Employee> empList = employeeService.findAllEmployee();
        model.addAttribute("empList", empList);
        System.out.println(empList);
        return "list";
    }
}
