package com.yourlastmemory.passgen;

import java.util.List;

public class PassGenApplication {
    public static void main(String[] args) {
        Generator generator = new Generator();
        List<String> passwords = generator.generateFewPasswordVariants(16,10);
        passwords.forEach(System.out::println);
    }
}
