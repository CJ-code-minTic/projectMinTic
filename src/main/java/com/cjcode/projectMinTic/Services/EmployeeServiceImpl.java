package com.cjcode.projectMinTic.Services;

import com.cjcode.projectMinTic.Entities.Employee;
import com.cjcode.projectMinTic.Exception.ApiException;
import com.cjcode.projectMinTic.Repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllUsers() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee createUser(Employee employee) throws ApiException {
        Employee employeeDb = employeeRepository.findByEmail(employee.getEmail());
        if (employeeDb == null){
            employee.setCreateAt(new Date());
            return  employeeRepository.save(employee);
        }
        else {
            throw ApiException.builder().message("usuario ya registrado").build();
        }
    }
}
