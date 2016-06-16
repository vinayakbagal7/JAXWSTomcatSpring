package ws;

import javax.xml.ws.Endpoint;

public class HelloWorldWSPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8081/JAXWSServer/WS/HelloWorld", new HelloWorldImpl());
	}
}
