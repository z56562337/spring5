package andy.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import andy.springframework.services.GreetingService;

@Controller
public class SetterInjectedController {
    
	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
	@Autowired
	@Qualifier("setterGreetingService")
	public void setGreetingService(GreetingService geetingService) {
		this.greetingService = geetingService;
	}
}
