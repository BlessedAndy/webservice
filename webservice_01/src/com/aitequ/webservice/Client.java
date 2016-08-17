package com.aitequ.webservice;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client {
	
	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("http://localhost:8888/ns?wsdl");
			QName sname = new QName("http://webservice.aitequ.com/","MyServiceImpService");
			Service service = Service.create(url, sname);
			 
			MyServiceInterface si = service.getPort(MyServiceImp.class);
			System.out.println(si.add(12, 17));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
