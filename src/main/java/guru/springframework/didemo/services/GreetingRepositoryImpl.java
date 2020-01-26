package guru.springframework.didemo.services;

import org.springframework.stereotype.Component;

/* BTuladhar created on 1/23/2020 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Primärer Grußdienst";
    }

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }
}
