package com.mycompany.management.controller;

import com.mycompany.management.entity.Employee;
import com.mycompany.management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {
    EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping({"/", "/showEmployees"})
    public ModelAndView showEmployees() {
        ModelAndView modelAndView = new ModelAndView("list-employees");
        List<Employee> employees = employeeService.findAll();
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }
}
