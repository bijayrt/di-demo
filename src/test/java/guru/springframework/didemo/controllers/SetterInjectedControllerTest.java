package guru.springframework.didemo.controllers;
/* BTuladhar created on 1/21/2020 */

import guru.springframework.didemo.controller.SetterInjectedController;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;
    @Before
    public void setUp() throws Exception{
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());

    }
}
