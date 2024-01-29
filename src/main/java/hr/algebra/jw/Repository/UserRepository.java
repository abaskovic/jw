package hr.algebra.jw.Repository;

import java.util.Optional;

import hr.algebra.jw.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Integer> {
 Optional<User> findByUsernameOrEmail(String username, String email);
}