package lk.ijse.cmjd108.LostandFound2025.controller.secure;

import lk.ijse.cmjd108.LostandFound2025.entities.Request;
import lk.ijse.cmjd108.LostandFound2025.service.secure.RequestSecureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/secure/requests")
@RequiredArgsConstructor
public class RequestSecureController {
    private final RequestSecureService requestSecureService;

    @PostMapping
    public ResponseEntity<Request> createRequest(@RequestBody Request request) {
        return ResponseEntity.ok(requestSecureService.createRequest(request));
    }

    @GetMapping("/item/{itemId}")
    public ResponseEntity<List<Request>> getRequestsForItem(@PathVariable Long itemId) {
        return ResponseEntity.ok(requestSecureService.getRequestsForItem(itemId));
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<Request> updateRequestStatus(
            @PathVariable Long id,
            @RequestParam Request.Status status) {
        return ResponseEntity.ok(requestSecureService.updateRequestStatus(id, status));
    }
}