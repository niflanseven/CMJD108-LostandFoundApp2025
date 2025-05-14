package lk.ijse.cmjd108.LostandFound2025.controller;

import lk.ijse.cmjd108.LostandFound2025.dto.LoginDto;
import lk.ijse.cmjd108.LostandFound2025.dto.RegisterDto;
import lk.ijse.cmjd108.LostandFound2025.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterDto registerDto) {
        return ResponseEntity.ok(authService.register(registerDto));
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDto loginDto) {
        return ResponseEntity.ok(authService.login(loginDto));
    }
}