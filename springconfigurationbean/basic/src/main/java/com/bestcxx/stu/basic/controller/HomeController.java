package com.bestcxx.stu.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.bestcxx.stu.basic.demo.service.ShowService;
import com.bestcxx.stu.basic.demo.service.Singer;
import com.bestcxx.stu.basic.demo.service.StageServiceImpl;

@Controller
public class HomeController {
	
	@Autowired
	private ShowService showService;
	
	@Autowired
	private StageServiceImpl StageServiceImpl;
	
	@Autowired
	private Singer singer;
	
	@GetMapping(value={"/home","/"})  
    public String homePage(){  
		showService.writeName("Jecket");
		StageServiceImpl.buildStage();
		singer.sing();
        return "home";  
    }  
}
