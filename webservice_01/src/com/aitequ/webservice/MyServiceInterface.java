package com.aitequ.webservice;

import javax.jws.WebService;

@WebService
public interface MyServiceInterface {
	public int add(int a,int b);
	
	public int minus(int a, int b);
}
