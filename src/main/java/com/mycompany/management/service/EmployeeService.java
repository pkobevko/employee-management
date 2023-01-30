package com.mycompany.management.service;

import com.mycompany.management.entity.Employee;
import org.springframework.lang.NonNull;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();

    public void save(@NonNull Employee employee);

    public Employee findById(int id);

    public void deleteById(int id);

    public void delete(@NonNull Employee employee);
}
