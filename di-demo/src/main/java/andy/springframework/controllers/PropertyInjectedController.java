package andy.springframework.controllers;

import andy.springframework.services.GreetingServicelmpl;

public class PropertyInjectedController {
	
	public GreetingServicelmpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
