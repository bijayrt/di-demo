package guru.springframework.didemo.controllers;
/* BTuladhar created on 1/21/2020 */

import guru.springframework.didemo.controller.ConstructorInjectedController;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        if(null==constructorInjectedController){
            System.out.println("This is null");
        }
        else
        {
            System.out.println("This is not null");
            System.out.println(constructorInjectedController.sayHello());
        }

        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }
}
