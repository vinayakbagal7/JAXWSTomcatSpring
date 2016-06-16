package ws;

import javax.jws.WebService;

@WebService(endpointInterface="ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String helloWorld(String name) {
		return "Hello world from " + name;
	}

}
