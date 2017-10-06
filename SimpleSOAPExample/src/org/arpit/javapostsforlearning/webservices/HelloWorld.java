package org.arpit.javapostsforlearning.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService()
public class HelloWorld {
    @WebMethod
    public String sayHelloWorld(String name){
        return "Привет "+name;
    }
    @WebMethod
    public int plusTwoNumber(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Object implementor = new HelloWorld();
        String address="http://localhost:9090/HelloWorld";
        Endpoint.publish(address,implementor);
    }
}
