package com.mars.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestListener2 implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("TestListener2 init...");

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("TestListener2 destory...");
	}
}
