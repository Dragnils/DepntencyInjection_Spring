package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired // внедрение зависимостей
    @Qualifier("greetingServiceImpl")  // выбираем конкретный бин для внедрения в зависимость через его id
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}
