package com.aitequ.webservice;

import javax.xml.ws.Endpoint;

public class MyServer {
	
	public static void main(String[] args) {
		String address = "http://localhost:8888/ns";
		Endpoint.publish(address, new MyServiceImp());
		
	}

}
