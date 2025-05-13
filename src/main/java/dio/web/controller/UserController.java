package dio.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.web.model.User;
import dio.web.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("")
    public List<User> getUsers() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable("id") Long id) {
        return repository.findById(id);
    }

    @PostMapping("/")
    public void save(@RequestBody User user) {
        repository.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }

}
