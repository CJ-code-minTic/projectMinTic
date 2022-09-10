package com.cjcode.projectMinTic.Services;


import com.cjcode.projectMinTic.Entities.Employee;
import org.springframework.http.ResponseEntity;

public interface EmployeeService {
    ResponseEntity<?> getAllUsers();
    ResponseEntity<?> createUser(Employee employee);
    ResponseEntity<?> getUserById(Long id);
    ResponseEntity<?> deleteUser(Long id);
    ResponseEntity<?> updateUser(Long id,Employee employee);
}
