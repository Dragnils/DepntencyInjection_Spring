package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary // говорящей о том, что если существует более одного компонента, я хочу использовать это один
@Profile({"en", "default"}) // если не выбран никакой класс с помощью профайла, он выбирает по умолчанию default Profile
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting service";
    }
}
