package com.javatpoint;

import javax.xml.ws.Endpoint;

public class Publisher {
    public static void main(String[] args) {
        String address="http://localhost:7779/ws/hello";
        Endpoint.publish(address,new HelloWorldImpl());
    }
}
