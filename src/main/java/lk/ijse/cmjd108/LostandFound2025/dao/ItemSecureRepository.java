package lk.ijse.cmjd108.LostandFound2025.dao;

import lk.ijse.cmjd108.LostandFound2025.dao.secure.SecureBaseRepository;
import lk.ijse.cmjd108.LostandFound2025.entities.secure.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemSecureRepository extends SecureBaseRepository<Item, Long> {
    @Repository
    interface ItemRepository extends JpaRepository<Item, Long> {
        // Custom methods if needed
    }
}