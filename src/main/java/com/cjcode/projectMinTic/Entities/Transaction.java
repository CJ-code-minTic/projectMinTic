package com.cjcode.projectMinTic.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transaction {
    private long id;
    private String concept;
    private float amount;
    private Employee user;
    private Enterprise enterprise;
    private Date createAt;
    private Date updateAt;
}
