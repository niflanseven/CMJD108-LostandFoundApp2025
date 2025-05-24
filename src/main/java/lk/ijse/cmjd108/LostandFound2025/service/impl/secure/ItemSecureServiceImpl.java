package lk.ijse.cmjd108.LostandFound2025.service.impl.secure;

import lk.ijse.cmjd108.LostandFound2025.dao.ItemSecureRepository;
import lk.ijse.cmjd108.LostandFound2025.entities.secure.Item;
import lk.ijse.cmjd108.LostandFound2025.service.secure.ItemSecureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemSecureServiceImpl implements ItemSecureService {
    private final ItemSecureRepository itemSecureRepository;

    @Override
    public Item createItem(Item item) {
        return itemSecureRepository.save(item);
    }

    @Override
    public Item getItemById(Long id) {
        Optional<Item> item = itemSecureRepository.findById(id);
        return item.orElseThrow(() -> new RuntimeException("Item not found"));
    }

    @Override
    public Iterable<Item> getAllItems() {
        return itemSecureRepository.findAll();
    }

    @Override
    public Item updateItem(Long id, Item item) {
        item.setId(id);
        return itemSecureRepository.save(item);
    }

    @Override
    public void deleteItem(Long id) {
        itemSecureRepository.deleteById(id);
    }

    @Override
    public Item updateItemStatus(Long id, Item.Status status) {
        Item item = itemSecureRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found"));
        item.setStatus(status);
        return itemSecureRepository.save(item);
    }
}