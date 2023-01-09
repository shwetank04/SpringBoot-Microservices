package com.rest.webservices.restfulwebservices.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		// All request should be authenticated
		http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
		// if a request is not authenticated,a webpage is shown
		http.httpBasic(withDefault());
		// disable csrf
		http.csrf().disable();
		return http.build();
	}

	private Customizer<HttpBasicConfigurer<HttpSecurity>> withDefault() {
		// TODO Auto-generated method stub
		return null;
	}
}
