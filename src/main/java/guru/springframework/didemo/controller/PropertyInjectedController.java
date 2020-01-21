package guru.springframework.didemo.controller;
/* BTuladhar created on 1/21/2020 */

import guru.springframework.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
