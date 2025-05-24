package lk.ijse.cmjd108.LostandFound2025.controller.secure;

import lk.ijse.cmjd108.LostandFound2025.entities.secure.Item;
import lk.ijse.cmjd108.LostandFound2025.service.secure.ItemSecureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/secure/items")
@RequiredArgsConstructor
public class ItemSecureController {
    private final ItemSecureService itemSecureService;

    @GetMapping
    public ResponseEntity<List<Item>> getAllItems() {
        return ResponseEntity.ok((List<Item>) itemSecureService.getAllItems());
    }

    @PostMapping
    public ResponseEntity<Item> createItem(@RequestBody Item item) {
        return ResponseEntity.ok(itemSecureService.createItem(item));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable Long id) {
        return ResponseEntity.ok(itemSecureService.getItemById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable Long id, @RequestBody Item item) {
        return ResponseEntity.ok(itemSecureService.updateItem(id, item));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id) {
        itemSecureService.deleteItem(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<Item> updateItemStatus(
            @PathVariable Long id,
            @RequestParam Item.Status status) {
        return ResponseEntity.ok(itemSecureService.updateItemStatus(id, status));
    }
}