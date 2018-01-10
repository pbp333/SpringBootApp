package com.pbp333.springbootapp.springBootApp.controllers;

import com.pbp333.springbootapp.springBootApp.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loginMessage(ModelMap modelMap) {

        modelMap.put("name", "me");
        return "welcome";
    }
}
