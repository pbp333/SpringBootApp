package com.pbp333.springbootapp.springBootApp.services;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

    public boolean validateUser(String username, String password) {

        return username.equalsIgnoreCase("me")
                && password.equalsIgnoreCase("mmmm");
    }
}
