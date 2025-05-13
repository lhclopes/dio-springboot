package dio.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.web.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
