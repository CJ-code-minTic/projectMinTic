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
public class Profile {
    private long id;
    private String image;
    private String phone;
    private Employee employee;
    private Date createAt;
    private Date updateAt;
}
