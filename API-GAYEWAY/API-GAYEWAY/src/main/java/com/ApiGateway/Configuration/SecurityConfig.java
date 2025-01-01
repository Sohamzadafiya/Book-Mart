package com.ApiGateway.Configuration;


import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;

import com.ApiGateway.Filter.JwtFilter;
import com.ApiGateway.Repository.UserRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	 
	 @Autowired
	 private  UserDetailsService userDetailsService;
	 
	 @Autowired
	 private JwtFilter jwtFilter;
	 
	 @Bean
	 public SecurityFilterChain configure(HttpSecurity http) throws Exception {
	        http
	            .csrf(csrf -> csrf.disable())
	            .authorizeHttpRequests(requests -> requests
	                  .requestMatchers("/login","/public").permitAll()
	                  .anyRequest().authenticated())
//	            .formLogin(Customizer.withDefaults())
	             .httpBasic(Customizer.withDefaults())
	             .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
	        return http.build();
	  }
	 
	 @Bean
	 public AuthenticationProvider authenticationProvider() {
			 DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
			 daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
			 daoAuthenticationProvider.setUserDetailsService(userDetailsService);
		return daoAuthenticationProvider;
	 }
	 
	 @Bean
	 public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
		 return config.getAuthenticationManager();
	 }
	 
	 public BCryptPasswordEncoder passwordEncoder() {
		 return new BCryptPasswordEncoder(10);
	 }
	 
	 
}
