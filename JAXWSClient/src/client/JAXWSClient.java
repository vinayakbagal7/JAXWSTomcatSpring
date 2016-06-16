package client;

import ws.HelloWorld;
import ws.HelloWorldImplService;

public class JAXWSClient {

	public static void main(String[] args) {
		HelloWorldImplService service = new HelloWorldImplService();
		HelloWorld hw = service.getHelloWorldImplPort();
		System.out.println(hw.helloWorld("Gatagat"));
	}

}
