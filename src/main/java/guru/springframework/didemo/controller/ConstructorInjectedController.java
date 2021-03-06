package guru.springframework.didemo.controller;
        /* BTuladhar created on 1/21/2020 */

        import guru.springframework.didemo.services.GreetingService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    @Autowired
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
