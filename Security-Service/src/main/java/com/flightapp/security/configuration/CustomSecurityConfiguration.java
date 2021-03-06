package com.flightapp.security.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class CustomSecurityConfiguration extends WebSecurityConfigurerAdapter
{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		auth.inMemoryAuthentication();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		http
				.csrf().and().cors().disable()
				.authorizeRequests()
				.antMatchers("/public/**").permitAll()
				.anyRequest().authenticated()
				.and()
				.formLogin();
		
	}
	
}
