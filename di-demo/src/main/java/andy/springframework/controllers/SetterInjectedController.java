package andy.springframework.controllers;

import andy.springframework.services.GreetingService;

public class SetterInjectedController {
    
	private GreetingService greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
	
	public void setGreetingService(GreetingService geetingService) {
		this.greetingService = geetingService;
	}
}
