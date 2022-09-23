package com.cjcode.projectMinTic.Controllers;

import com.cjcode.projectMinTic.Services.FrontService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;


@Controller
public class FrontController {

    @Autowired
    private FrontService service;

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
    public String user(){
        return "users";
    }

    @GetMapping("/user/form")
    public String userForm(){
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

    @GetMapping("/unauthorized")
    public String unauthorized(){
        return "unauthorized";
    }
}
