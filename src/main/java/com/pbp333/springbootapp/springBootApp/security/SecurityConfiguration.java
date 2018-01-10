package com.pbp333.springbootapp.springBootApp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.net.Authenticator;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder managerBuilder) throws Exception{

        managerBuilder.inMemoryAuthentication().withUser("me").password("mmmm").roles("USER", "ADMIN");
    }

    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.authorizeRequests().antMatchers("/login").permitAll().
                antMatchers("/", "/*todo*/**").access("hasRole('USER')").
                and().formLogin();
    }
}
