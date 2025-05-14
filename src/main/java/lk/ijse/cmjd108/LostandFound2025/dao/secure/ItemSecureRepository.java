package lk.ijse.cmjd108.LostandFound2025.dao.secure;

import lk.ijse.cmjd108.LostandFound2025.entities.secure.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemSecureRepository extends SecureBaseRepository<Item, Long> {
}