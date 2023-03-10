package it.epicode.flaviocirillo.D2S7_1.Esercizio1_G2_S7.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers("/app/data1", "/app/data2", "/app/data3")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and().formLogin()
		.successForwardUrl("/login_success")
		.and()
		.logout()
		.and()
		.csrf()
		.disable();
		
	}
	
}
