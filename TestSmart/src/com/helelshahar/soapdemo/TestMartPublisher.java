package com.helelshahar.soapdemo;

import javax.xml.ws.Endpoint;

public class TestMartPublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Endpoint.publish("http://localhost:1234/productcatalog", new ProductCatalog());
	}

}
