package andy.springframework.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import andy.springframework.services.GreetingServicelmpl;

public class ConstructorInjectedControllerTest {
    
    private ConstructorInjectedController constructorInjectedController;
    
    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServicelmpl());
    }
    
    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServicelmpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }
}
