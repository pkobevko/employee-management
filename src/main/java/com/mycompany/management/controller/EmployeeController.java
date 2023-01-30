package com.mycompany.management.controller;

import com.mycompany.management.entity.Employee;
import com.mycompany.management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/addEmployeeForm")
    public ModelAndView addEmployeeForm() {
        ModelAndView modelAndView = new ModelAndView("add-employee-form");
        Employee employee = new Employee();
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute Employee employee) {
        employeeService.save(employee);
        return "redirect:/";
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Integer employeeId) {
        ModelAndView modelAndView = new ModelAndView("update-employee-form");
        Employee employee = employeeService.findById(employeeId);
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }
}
