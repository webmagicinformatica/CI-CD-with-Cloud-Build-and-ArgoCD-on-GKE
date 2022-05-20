package net.goinit.springboothelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello from Code Build!! Master Branch!!";
	}
	
}
