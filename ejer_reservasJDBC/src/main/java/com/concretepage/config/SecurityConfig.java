/**
 * 
 */
package com.concretepage.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.concretepage.service.MyAppUserDetailsService;

/**
 * @author Curso ma�ana
 *
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private MyAppUserDetailsService myAppUserdetailsService;
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().antMatchers("/user/**").hasAnyRole("ADMIN","USER")
		.and().formLogin().loginPage("/customLogin.jsp")
		.loginProcessingUrl("/appLogin").usernameParameter("app_username")
		.passwordParameter("app_password").defaultSuccessUrl("/user/home")
		.and().logout()
		.logoutUrl("/appLogout")
		.logoutSuccessUrl("/customLogin.jsp")
		.and().exceptionHandling().accessDeniedPage("/user/error");
	}
	@Autowired
public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
	auth.userDetailsService(myAppUserdetailsService).passwordEncoder(passwordEncoder());
	}
@Bean
public PasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder;
}
}
