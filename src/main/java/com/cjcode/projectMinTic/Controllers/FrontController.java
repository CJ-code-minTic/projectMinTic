package com.cjcode.projectMinTic.Controllers;

import com.cjcode.projectMinTic.Entities.Employee;
import com.cjcode.projectMinTic.Entities.Enterprise;
import com.cjcode.projectMinTic.Services.EmployeeService;
import com.cjcode.projectMinTic.Services.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontController {
    @Autowired
    EnterpriseService enterpriseService;
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser principal) {
        if(principal != null){
            System.out.println(principal.toString());
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
    public String transactions(){
        return "transactions";
    }

    @GetMapping("/transaction/form")
    public String transactionsForm(){
        return "transactionsForm";
    }

    @GetMapping("/enterprise")
    public String enterprises(){

        return "enterprises";
    }

    @GetMapping("/enterprise/form")
    public String enterprisesForm(){
        return "enterprisesForm";
    }
}
