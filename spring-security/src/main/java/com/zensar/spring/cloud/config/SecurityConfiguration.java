package com.zensar.spring.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter  {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth
		.inMemoryAuthentication()
		.withUser("Ram")
		.password("Ram@123")
		.roles("USER")
		.and()
		.withUser("Laxman")
		.password("Laxman@123")
		.roles("ADMIN");
	}
	
	
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
		.authorizeRequests()
		.antMatchers("/")
		.permitAll()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasAnyRole("USER","ADMIN")
		.and()
		.httpBasic()
		.and()
		.formLogin();
		
		
	}




	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
