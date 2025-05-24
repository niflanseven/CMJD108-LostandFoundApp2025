package lk.ijse.cmjd108.LostandFound2025.service.secure;

import lk.ijse.cmjd108.LostandFound2025.entities.secure.Item;

public interface ItemSecureService {
    Item createItem(Item item);
    Item getItemById(Long id);
    Iterable<Item> getAllItems();
    Item updateItem(Long id, Item item);
    void deleteItem(Long id);

    Item updateItemStatus(Long id, Item.Status status);
}