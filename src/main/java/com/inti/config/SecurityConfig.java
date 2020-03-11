package com.inti.config;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.inti.service.impl.AppUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private AppUserDetailsService userDetailService;

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailService);
	}
	//l'autenthification: il faut passer par une verification du role de l'utilisateur

	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/users/**", "/roles/**");
	}
	//l'autenthification passe par des http qui vienne de users et roles

	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/", "index.html", "/app/**", "/assets/**", "/environments/**")
		//les http autorisé sont les suivant entre guillmet
		.permitAll()
		.anyRequest().authenticated()
		//Sinon pour tt les autres requète: âsser par une authentification
		.and()
		.formLogin().permitAll()
		.and()
		.logout().logoutUrl("/logout")
		//le logou a l'url autorisé suivant
		.deleteCookies("JSESSIONID").permitAll()
		.and().httpBasic()
		.and().csrf().disable();
	}
	
	@Bean
	public FilterRegistrationBean simpleCorsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		
		config.setAllowCredentials(true);
		config.setAllowedOrigins(Arrays.asList("http:localhost:4200"));
		//les http d'origine vienne du port 42000
		config.setAllowedMethods(Collections.singletonList("*")); //GET POST PUT DELETE
		//on accepte tt les méthode dans le requète (*)
		config.setAllowedHeaders(Collections.singletonList("*"));
		//on accepte tt les ordres dans les enthêtes http
		
		source.registerCorsConfiguration("/**", config);
		
		FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
		bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
		return bean;
	}


}
