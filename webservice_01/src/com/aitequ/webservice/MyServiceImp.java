package com.aitequ.webservice;

import javax.jws.WebService;

@WebService(endpointInterface="com.aitequ.webservice.MyServiceInterface")
public class MyServiceImp implements MyServiceInterface {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("a + b = "+ (a+b));
		return a + b;
	}

	@Override
	public int minus(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("a - b = "+ (a-b));
		return a - b;
	}

}
