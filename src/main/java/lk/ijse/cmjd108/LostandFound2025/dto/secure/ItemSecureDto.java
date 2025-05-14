package lk.ijse.cmjd108.LostandFound2025.dto.secure;

import lk.ijse.cmjd108.LostandFound2025.entities.secure.Item;
import lombok.Data;

@Data
public class ItemSecureDto {
    private String title;
    private String description;
    private String location;
    private Item.Status status;
}