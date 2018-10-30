package com.hyj.consumer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hyj.service.TestDubbo;

@RestController
public class ServiceConsumer {
	
	@Reference
	TestDubbo testDubbo;
	
	@RequestMapping("helloWorld")
	public String t(){
		return testDubbo.sayHello("htlloWorld");
	}

}
