package andy.springframework.controllers;

import andy.springframework.services.GreetingService;

public class ConstructorInjectedController {
	
	private GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
}
