package com.cjcode.projectMinTic;

import com.cjcode.projectMinTic.Entities.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

//@SpringBootApplication
public class ProjectMinTicApplication{

	public static void main(String[] args) {
		//SpringApplication.run(ProjectMinTicApplication.class, args);
		//Enterprise
		Enterprise enterprise = Enterprise.builder().id(1L).name("Demo Enterprise").document("0000000001")
				.phone("000000002").address("Calle falsa 123").build();
		System.out.println("Name Enterprise: " + enterprise.getName());
		System.out.println("Address Enterprise: " + enterprise.getAddress());
		System.out.println("Phone Enterprise: " + enterprise.getPhone());
		System.out.println("Document Enterprise: " + enterprise.getDocument());
		enterprise.setName("Prod Enterprise");
		enterprise.setAddress("Avenida Siempre viva 742");
		enterprise.setPhone("123456789");
		enterprise.setDocument("000001002032");
		System.out.println("Name Enterprise: " + enterprise.getName());
		System.out.println("Address Enterprise: " + enterprise.getAddress());
		System.out.println("Phone Enterprise: " + enterprise.getPhone());
		System.out.println("Document Enterprise: " + enterprise.getDocument());
		//Employee
		Employee employee = Employee.builder().id(1L).name("Juan Pablo").email("juannech48@gmail.com")
				.profile(Profile.builder().id(1L).image("default.png").phone("3178682283").createAt(new Date()).build())
				.enterprise(Enterprise.builder().build()).role(Role.Admin).build();
		System.out.println("Employee Name: " + employee.getName());
		System.out.println("Employee email: " + employee.getEmail());
		System.out.println("Employee enterprise: " + employee.getEnterprise());
		System.out.println("Employee Role: " + employee.getRole());
		employee.setName("Jonathan Diaz");
		employee.setEmail("jonathandiaz@gmail.com");
		employee.setEnterprise(enterprise);
		employee.setRole(Role.Operario);
		System.out.println("Employee Name: " + employee.getName());
		System.out.println("Employee email: " + employee.getEmail());
		System.out.println("Employee enterprise: " + employee.getEnterprise());
		System.out.println("Employee Role: " + employee.getRole());
		//Transaction
		Transaction transaction = Transaction.builder().id(1L).concept("Pago de Deudas").amount(-1500)
				.user(Employee.builder().id(2L).name("Juan Pablo").email("juannech48@gmail.com")
						.build())
				.enterprise(enterprise)
				.build();
		System.out.println("Transaction Amount: " + transaction.getAmount());
		System.out.println("Transaction Concept: " + transaction.getConcept());
		System.out.println("Transaction User: " + transaction.getUser());
		transaction.setAmount(15000);
		transaction.setConcept("Venta de Equipo");
		transaction.setUser(employee);
		System.out.println("Transaction Amount: " + transaction.getAmount());
		System.out.println("Transaction Concept: " + transaction.getConcept());
		System.out.println("Transaction User: " + transaction.getUser());

	}
}
