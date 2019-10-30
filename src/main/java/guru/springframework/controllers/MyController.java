package guru.springframework.controllers;


import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    @Autowired
    public MyController(GreetingService greetingService) { // указали аннотацию  @Primary в Service - PrimaryGreetingService, уточнитель ( @Qualifier) не нужен
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!!");
        return greetingService.sayGreeting(); // берет сообщение от PrimaryGreetingService, т.к. у него аннотация стоит  @Primary, уточнитель ( @Qualifier) не нужен
    }
}
