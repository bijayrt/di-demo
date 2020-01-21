package guru.springframework.didemo.controller;
        /* BTuladhar created on 1/21/2020 */

        import guru.springframework.didemo.services.GreetingService;

public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
