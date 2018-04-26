package com.spring.rest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class Security extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
		http.authorizeRequests()   // Authorise requests
	//	.antMatchers("*/rest/*")   // Only perticular patterns requests
		.anyRequest()			   // All url patterns accepted
		.fullyAuthenticated()
	//	.permitAll()			   // Without authentication permit requests
		.and().httpBasic();		   // Basic  http authentication
		
		http.csrf().disable();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder amb) throws Exception{
		
		amb.inMemoryAuthentication()
		.withUser("Dhananjay").password("12345").roles("User")
		.and()
		.withUser("admin").password("654321").roles("admin");
	}

}
