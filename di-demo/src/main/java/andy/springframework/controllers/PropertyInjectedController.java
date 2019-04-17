package andy.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import andy.springframework.services.GreetingService;

@Controller
public class PropertyInjectedController {
	
    @Autowired
	public GreetingService greetingServicelmpl; // the property has the same name (but use @Qualifier is better)
	
	public String sayHello() {
		return greetingServicelmpl.sayGreeting();
	}

}
