package com.bestcxx.stu.basic.demo.service;

public class StageServiceImpl{
	private ShowService showService;
	public StageServiceImpl(){}
	public StageServiceImpl(ShowService showService){
		this.showService=showService;
	}
	public void buildStage(){
		System.out.println("Stage Is Ok");
	}
}
