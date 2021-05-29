package com.yourlastmemory.passgen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    private final Random random = new Random();
    public String generatePassword(int passwordLength) {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < passwordLength; i++) {
            final int char_index = random.nextInt(Alphabet.ALPHABET_LENGTH);
            password.append(Alphabet.CHARACTERS.get(char_index));
        }
        return password.toString();
    }
    public List<String> generateFewPasswordVariants(int passwordLength, int count) {
        List<String> passwords = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            passwords.add(generatePassword(passwordLength));
        }
        return passwords;
    }
}
