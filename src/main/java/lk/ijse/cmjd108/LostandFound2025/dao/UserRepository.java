package lk.ijse.cmjd108.LostandFound2025.dao;

import lk.ijse.cmjd108.LostandFound2025.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}