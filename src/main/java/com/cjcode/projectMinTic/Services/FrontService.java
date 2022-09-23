package com.cjcode.projectMinTic.Services;

import com.cjcode.projectMinTic.Entities.Employee;

import javax.servlet.http.HttpSession;

public interface FrontService {
    String validateUser(String email, HttpSession session);
}
