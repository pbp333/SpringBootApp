package com.pbp333.springbootapp.springBootApp.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class WelcomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loginMessage(ModelMap modelMap) {

        modelMap.put("name", getLoggedInUserName());
        System.out.println(modelMap.get("name"));
        return "welcome";
    }

    public String getLoggedInUserName(){

        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if(principal instanceof UserDetails){
           return ((UserDetails)principal).getUsername();
        }
        return principal.toString();
    }
}
