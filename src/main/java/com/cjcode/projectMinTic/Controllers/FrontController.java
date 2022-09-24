package com.cjcode.projectMinTic.Controllers;

import com.cjcode.projectMinTic.Entities.Employee;
import com.cjcode.projectMinTic.Entities.Enterprise;
import com.cjcode.projectMinTic.Entities.Transaction;
import com.cjcode.projectMinTic.Services.EmployeeService;
import com.cjcode.projectMinTic.Services.EnterpriseService;
import com.cjcode.projectMinTic.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.cjcode.projectMinTic.Services.FrontService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;


import java.util.List;

@Controller
public class FrontController {

    @Autowired
    private FrontService service;
    @Autowired
    TransactionService transactionService;
    @Autowired
    EnterpriseService enterpriseService;
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser principal, HttpSession session) {
        if(principal != null){
            return service.validateUser(principal.getEmail(),session);
        }
        return "index";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/user")
    public String user(Model model){
        List<Employee> user = employeeService.getAllUsersMVC();
        model.addAttribute("user", user);
        return "users";
    }

    @GetMapping("/user/form")
    public String userForm(Model model){
        List<Enterprise> enterprises= enterpriseService.getAllEnterpriseMVC();
        model.addAttribute("enterprises", enterprises);
        model.addAttribute("user", new Employee());
        return "usersForm";
    }

    @GetMapping("/transaction")
    public String transactions(Model model){
        List<Transaction> transaction = transactionService.getAllTransactionsMVC();
        model.addAttribute("transaction", transaction);
        return "transactions";
    }

    @GetMapping("/transaction/form")
    public String transactionsForm(Model model){
        List<Employee> users = employeeService.getAllUsersMVC();
        List<Enterprise> enterprises = enterpriseService.getAllEnterpriseMVC();
        model.addAttribute("users", users);
        model.addAttribute("enterprises", enterprises);
        model.addAttribute("transaction", new Transaction());
        return "transactionsForm";
    }

    @GetMapping("/enterprise")
    public String enterprises(Model model){
        List<Enterprise> enterprises = enterpriseService.getAllEnterpriseMVC();
        model.addAttribute("enterprises",enterprises);
        return "enterprises";
    }

    @GetMapping("/enterprise/form")
    public String enterprisesForm(Model model){
        model.addAttribute("enterprise", new Enterprise());
        return "enterprisesForm";
    }

    @GetMapping("/unauthorized")
    public String unauthorized(){
        return "unauthorized";
    }
}
