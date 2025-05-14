package lk.ijse.cmjd108.LostandFound2025.dao.secure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SecureBaseRepository<T, ID> extends JpaRepository<T, ID> {
}
