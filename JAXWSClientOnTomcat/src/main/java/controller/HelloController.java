package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ws.HelloWorld;
import ws.HelloWorldImplService;

@Controller
public class HelloController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap map) {
		HelloWorldImplService service = new HelloWorldImplService();
		HelloWorld hw = service.getHelloWorldImplPort();
		map.put("message", hw.helloWorld("Vinayak"));
		return "index";
	}
	
	@RequestMapping(value = "/")
	public String printHelloWorld() {
		return "redirect:index";
	}
}
