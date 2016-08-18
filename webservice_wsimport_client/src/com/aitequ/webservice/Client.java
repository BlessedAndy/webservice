package com.aitequ.webservice;

public class Client {
	
	public static void main(String[] args) {
		
		MyServiceImpService sis = new MyServiceImpService();
		MyServiceInterface si = sis.getMyServiceImpPort();
		System.out.println(si.add(17, 5));
		
	}

}
