package com.mars.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import com.mars.scheduled.MyAdaptableJobFactory;
import com.mars.scheduled.MyQuartz;

@Configuration
public class QuartzConfig {

	/**
	 * 1-创建Job对象
	 * 
	 * @return
	 */
	@Bean
	public JobDetailFactoryBean createJobFactoryBean() {
		JobDetailFactoryBean jobFactory = new JobDetailFactoryBean();
		// 关联job
		jobFactory.setJobClass(MyQuartz.class);

		return jobFactory;
	}

	/**
	 * 2-创建Trigger对象
	 * 
	 * @param jobFactory
	 * @return
	 */
	@Bean
	public CronTriggerFactoryBean createTriggerFactoryBean(JobDetailFactoryBean jobFactory) {
		CronTriggerFactoryBean triggerFactory = new CronTriggerFactoryBean();
		triggerFactory.setJobDetail(jobFactory.getObject());

		// 设置触发时间
		triggerFactory.setCronExpression("0/2 * * * * ?");

		return triggerFactory;
	}

	/**
	 * 3-创建Scheduler对象
	 * @param triggerFactory
	 * @param myJobFactory
	 * @return
	 */
	@Bean
	public SchedulerFactoryBean createSchedulerFactoryBean(CronTriggerFactoryBean triggerFactory,
			MyAdaptableJobFactory myJobFactory) {
		SchedulerFactoryBean schedulerFactory = new SchedulerFactoryBean();
		// 关联trigger
		schedulerFactory.setTriggers(triggerFactory.getObject());
		schedulerFactory.setJobFactory(myJobFactory);

		return schedulerFactory;
	}
}
