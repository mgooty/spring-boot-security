package com.test.spring.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.web.filter.GenericFilterBean;

public class StatelessAuthenticationFilter extends GenericFilterBean {
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
							throws IOException, ServletException {
		System.out.println("stateless authentication filter");
		chain.doFilter(request, response);
	}

}
