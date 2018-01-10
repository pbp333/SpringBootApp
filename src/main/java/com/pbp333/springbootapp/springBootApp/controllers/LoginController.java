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

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    //@ResponseBody
    public String loginMessage(ModelMap modelMap) {

        //modelMap.put("name", name);
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    //@ResponseBody
    public String loggedInMessage(@SessionAttribute @RequestParam String name, @RequestParam String password, ModelMap modelMap) {

        if (loginService.validateUser(name, password)) {
            modelMap.put("name", name);
            modelMap.put("password", password);
            return "welcome";
        }
        String message = "Invalid login";
        modelMap.put("message", message);
        return "login";
    }


}
