package com.hyj.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hyj.service.TestDubbo;

@Service
public class ServiceProvider implements TestDubbo{

	@Override
	public String sayHello(String param) {
		return "service provider20880 return "+param;
	}

}
