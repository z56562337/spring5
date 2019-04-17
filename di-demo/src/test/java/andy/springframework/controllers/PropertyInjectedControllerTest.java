package andy.springframework.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import andy.springframework.controllers.PropertyInjectedController;
import andy.springframework.services.GreetingServicelmpl;

public class PropertyInjectedControllerTest {
	
	private PropertyInjectedController propertyInjectedController;
	
	@Before
	public void setUp() throws Exception{
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServicelmpl();
	}
	
	@Test
	public void testGreeting() throws Exception {
		assertEquals(GreetingServicelmpl.HELLO_GURUS, propertyInjectedController.sayHello());
	}
}
