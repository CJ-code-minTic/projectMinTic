package com.cjcode.projectMinTic.Controllers;

import com.cjcode.projectMinTic.Entities.Employee;
import com.cjcode.projectMinTic.Exception.ApiException;
import com.cjcode.projectMinTic.Repositories.EmployeeRepository;
import com.cjcode.projectMinTic.Services.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getEmployees(){
        return service.getAllUsers();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) throws ApiException {
        return service.createUser(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") Long id){
        return Employee.builder().build();
    }

    @PutMapping("/{Id}")
    public Employee updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee){
        return Employee.builder().build();
    }

    @DeleteMapping("/{Id}")
    public Boolean deleteEmployee(@PathVariable("id") Long id){
        try{

            return true;
        }catch (Exception e){
            return false;
        }
    }
}
