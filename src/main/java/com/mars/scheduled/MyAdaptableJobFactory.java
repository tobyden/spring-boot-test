package com.mars.scheduled;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.stereotype.Component;

@Component
public class MyAdaptableJobFactory extends AdaptableJobFactory {

	@Autowired
	private AutowireCapableBeanFactory autowireCapableBeanFactory;
	
	@Override
	protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
		Object jobObj = super.createJobInstance(bundle);
		
		//将obj对象添加Spring IOC容器中，并完成注入
		this.autowireCapableBeanFactory.autowireBean(jobObj);
		
		return jobObj;
	}
}
