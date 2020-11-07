package dan.home.pl.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
    private UserRepository userRepository;


    @GetMapping("/login")
    public String login(@RequestParam String login, @RequestParam String password) {
        return null;
    }

    @PostMapping("/register")
    public String register() {

        User user = new User("login", "password");
        userRepository.save(user);

        return user.getId().toString();
    }
}
