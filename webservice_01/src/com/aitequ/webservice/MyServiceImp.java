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

	@Override
	public User login(String username, String password) {
		System.out.println("UserName : "+ username + " PassWord : "+ password);
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		return user;
	}

}
