package com.aitequ.webservice;

public class MyServiceImp implements MyServiceInterface {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("a + b = "+ (a+b));
		return 0;
	}

	@Override
	public int minus(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("a - b = "+ (a-b));
		return 0;
	}

}
