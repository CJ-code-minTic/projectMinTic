package com.cjcode.projectMinTic.Services;


import com.cjcode.projectMinTic.Entities.Employee;
import com.cjcode.projectMinTic.Exception.ApiException;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllUsers();
    Employee createUser(Employee employee) throws ApiException;

}
