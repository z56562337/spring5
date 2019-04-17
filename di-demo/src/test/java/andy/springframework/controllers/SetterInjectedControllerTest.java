package andy.springframework.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import andy.springframework.services.GreetingServicelmpl;

public class SetterInjectedControllerTest {
	
    private SetterInjectedController setterInjectedController;
	
    @Before
    public void setUp() throws Exception{
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServicelmpl());
    }
    
    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServicelmpl.HELLO_GURUS, setterInjectedController.sayHello());
    }
}
