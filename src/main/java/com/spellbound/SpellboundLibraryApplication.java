package com.spellbound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpellboundLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpellboundLibraryApplication.class, args);
        System.out.println("✅ Spellbound Library Server is running");
    }
}
