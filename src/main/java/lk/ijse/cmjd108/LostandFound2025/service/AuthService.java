package lk.ijse.cmjd108.LostandFound2025.service;

import lk.ijse.cmjd108.LostandFound2025.dao.UserRepository;
import lk.ijse.cmjd108.LostandFound2025.dto.LoginDto;
import lk.ijse.cmjd108.LostandFound2025.dto.RegisterDto;
import lk.ijse.cmjd108.LostandFound2025.entities.User;
import lk.ijse.cmjd108.LostandFound2025.security.CustomUserDetails;
import lk.ijse.cmjd108.LostandFound2025.security.jwt.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    public String register(RegisterDto registerDto) {
        User user = new User();
        user.setName(registerDto.getName());
        user.setEmail(registerDto.getEmail());
        user.setPassword(passwordEncoder.encode(registerDto.getPassword()));
        user.setRole(User.Role.valueOf(registerDto.getRole().toUpperCase()));

        userRepository.save(user);
        return "User registered successfully";
    }

    public String login(LoginDto loginDto) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginDto.getEmail(),
                        loginDto.getPassword()
                )
        );
        CustomUserDetails userDetails = (CustomUserDetails) authentication.getPrincipal();
        return jwtUtil.generateToken(userDetails);
    }
}