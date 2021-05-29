package com.mars.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mars.web.TestFilter2;
import com.mars.web.TestListener2;
import com.mars.web.TestServlet2;

@Configuration
@ServletComponentScan
public class WebConfig {

	@Bean
	public ServletRegistrationBean registerServlet(){
		ServletRegistrationBean servletBean = new ServletRegistrationBean();
		servletBean.setServlet(new TestServlet2());
		servletBean.addUrlMappings("/servlet/servlet2");
		
		return servletBean;
	}
	
	@Bean
	public FilterRegistrationBean registerFilter() {
		FilterRegistrationBean filterBean = new FilterRegistrationBean();
		filterBean.setFilter(new TestFilter2());
		filterBean.addUrlPatterns("/servlet/*");
		
		return filterBean;
	}
	
	@Bean
	public ServletListenerRegistrationBean<TestListener2> registerListener() {
		ServletListenerRegistrationBean<TestListener2> listenerBean = new ServletListenerRegistrationBean<TestListener2>();
		listenerBean.setListener(new TestListener2());
		
		return listenerBean;
	}
}
