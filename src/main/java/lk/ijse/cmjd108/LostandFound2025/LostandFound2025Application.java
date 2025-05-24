package lk.ijse.cmjd108.LostandFound2025;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "lk.ijse.cmjd108.LostandFound2025.dao")
public class LostandFound2025Application {
	public static void main(String[] args) {
		SpringApplication.run(LostandFound2025Application.class, args);
	}
}