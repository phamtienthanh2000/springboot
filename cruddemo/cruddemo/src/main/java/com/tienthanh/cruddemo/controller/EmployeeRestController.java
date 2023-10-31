package com.tienthanh.cruddemo.controller;


import com.tienthanh.cruddemo.entity.Employee;
import com.tienthanh.cruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;
;
    public EmployeeRestController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }


    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        Employee employee = employeeService.findById(employeeId);
        if(employee == null){
            throw new RuntimeException("Employee id not found "+employeeId);
        }

        return  employee;
    }



    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        Employee dbEmployee = employeeService.save(employee);
        return dbEmployee;
    }


    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        System.out.println("checkpoint 1 "+employee);
        Employee employee1 = employeeService.save(employee);
        return employee1;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id){
        Employee employee = employeeService.findById(id);
        if(employee==null){
            throw new RuntimeException("Employee not found");
        }

        employeeService.deleteById(id);
        return "Deleted employee id "+id;

    }


}
