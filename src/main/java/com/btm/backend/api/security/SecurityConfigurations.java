package com.btm.backend.api.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfigurations extends WebSecurityConfigurerAdapter {
	
	/**
	 * Configuracoes de Autenticacao
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	}
	
	/**
	 *  Configuracoes de Autorizacao
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		    .antMatchers("/actuator/**").permitAll()
		    .antMatchers("/test/**").permitAll()
			.anyRequest().authenticated();
//			.and().csrf().disable()
//			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//			.and().addFilterBefore(new JwtAuthenticationTokenFilter(httpClientGoApi), UsernamePasswordAuthenticationFilter.class);
	}
	
	/**
	 * Configuracoes de recursos estaticos (js, css, imagens, etc.)
	 */
	@Override
	public void configure(WebSecurity web) throws Exception {
	}


}
