package com.bestcxx.stu.basic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bestcxx.stu.basic.demo.service.ShowService;
import com.bestcxx.stu.basic.demo.service.ShowServiceImpl;
import com.bestcxx.stu.basic.demo.service.StageServiceImpl;

//JavaConfig 类
@Configuration
public class BottomConfig {
	@Bean
	public ShowService getShowService(){
		return new ShowServiceImpl();
	}
	
	@Bean
	public StageServiceImpl getStageService(){
		return new StageServiceImpl(getShowService());
	}
}
