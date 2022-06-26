package com.spring.jwt.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class WebSecurityConfig {
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception{
		
		httpSecurity.csrf().disable().authorizeRequests().antMatchers("/authenthicate,"/user").permitAll().anyRequest().authenticated().and().ExceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint).and().sessionManagement().sessionCreatePolicy(SessionCreationPolicy.STATELESS);"
	
		httpSecurity.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
	}

}
