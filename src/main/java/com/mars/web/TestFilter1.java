package com.mars.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(filterName="TestFilter1", urlPatterns="/servlet/*")
public class TestFilter1 implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("进入TestFilter1");
		chain.doFilter(request, response);
		System.out.println("离开TestFilter1");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
