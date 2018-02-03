package com.bestcxx.stu.basic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;


//JavaConfig 类
@Configuration
@Import(BottomConfig.class)//本类被配置为Spring Bean，BottomConfig.java 未被配置在xml中
@ImportResource("classpath:spring/applicationContext-bean2.xml")//applicationContext-bean2.xml 未被包含在applicationContext.xml 中
public class TopConfig {
}
