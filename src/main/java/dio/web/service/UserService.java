package dio.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import dio.web.model.User;
import dio.web.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository repository;

    private PasswordEncoder encoder;

    public UserService(UserRepository repository, PasswordEncoder encoder) {
        this.repository = repository;
        this.encoder = encoder;
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return repository.findById(id);
    }

    public User createUser(User user) {
        String pass = user.getPassword();

        user.setPassword(encoder.encode(pass));

        return repository.save(user);
    }

    public Optional<User> updateUser(Long id, User userDetails) {
        return repository.findById(id).map(user -> {
            user.setName(userDetails.getName());
            user.setUsername(userDetails.getUsername());
            user.setPassword(userDetails.getPassword());
            return repository.save(user);
        });
    }

    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}
