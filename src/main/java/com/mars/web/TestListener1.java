package com.mars.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestListener1 implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("TestListener1 init...");

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("TestListener1 destory...");
	}
}
