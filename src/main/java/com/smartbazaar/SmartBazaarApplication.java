package com.smartbazaar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.smartbazaar.entity.Product;
import com.smartbazaar.entity.User;
import com.smartbazaar.entity.Wallet;
import com.smartbazaar.repository.ProductRepository;
import com.smartbazaar.repository.UserRepository;

@SpringBootApplication
public class SmartBazaarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartBazaarApplication.class, args);
    }

    // sample data loader
    @Bean
    CommandLineRunner init(ProductRepository productRepo, UserRepository userRepo) {
        return args -> {
            productRepo.save(new Product(null, "Wireless Mouse", "Electronics", 599.0));
            productRepo.save(new Product(null, "Keyboard", "Electronics", 899.0));
            User u = new User(null, "alice", "alice@example.com");
            u.setWallet(new Wallet(null, 1000.0, u));
            userRepo.save(u);
        };
    }
}
