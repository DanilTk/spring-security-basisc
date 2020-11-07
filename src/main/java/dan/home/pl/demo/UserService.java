package dan.home.pl.demo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository repository;

    public void save(User user) {
        repository.save(user);
    }

    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }
}
