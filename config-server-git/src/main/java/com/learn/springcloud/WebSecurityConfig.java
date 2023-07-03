package com.learn.springcloud;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	protected void configure(HttpSecurity httpSecurity) throws Exception{
		httpSecurity.authorizeRequests()
		.anyRequest()
		.permitAll()
		.and()
		.csrf()
		.disable();
	}

}
