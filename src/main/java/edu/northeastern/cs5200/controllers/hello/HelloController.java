package edu.northeastern.cs5200.controllers.hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello Prajacta!";
	}
}
