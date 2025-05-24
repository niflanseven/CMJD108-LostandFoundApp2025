package lk.ijse.cmjd108.LostandFound2025.entities.secure;

import jakarta.persistence.*;
import lk.ijse.cmjd108.LostandFound2025.entities.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDateTime;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Item extends SecureBaseEntity {
    private String title;
    private String description;
    private String location;
    private LocalDateTime date;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    private User user;

    public enum Status {
        LOST, FOUND, CLAIMED
    }
}