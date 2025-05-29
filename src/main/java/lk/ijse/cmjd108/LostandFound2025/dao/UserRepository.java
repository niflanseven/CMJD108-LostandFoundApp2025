package lk.ijse.cmjd108.LostandFound2025.dao;

import lk.ijse.cmjd108.LostandFound2025.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email); // Add this method
}