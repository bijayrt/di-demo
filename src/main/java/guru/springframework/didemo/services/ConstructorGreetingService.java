package guru.springframework.didemo.services;
/* BTuladhar created on 1/23/2020 */

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I am constructor injected dependency example";
    }
}
