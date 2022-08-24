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
public class Employee {
    private long id;
    private String name;
    private String email;
    private Profile profile;
    private Role role;
    private Enterprise enterprise;
    private List<Transaction> transactions;
    private Date createAt;
    private Date updateAt;
}
