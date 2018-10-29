package com.dubbo.test.service;

import org.springframework.stereotype.Service;

@Service
public class DubboServiceImpl {

	public String getData(String name) {
		return "À´Õß£º" + name;
	}
}
