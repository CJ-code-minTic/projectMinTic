package com.cjcode.projectMinTic.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Enterprise {
    private long id;
    private String name;
    private String document;
    private String phone;
    private String address;
    private List<Employee> users;
    private List<Transaction> transactions;
    private Date createAt;
    private Date updateAt;
}
