package com.yourlastmemory.passgen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Alphabet {
    public static final List<Character> CHARACTERS =
            List.of(
                    'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'O', 'P', 'A', 'S',
                    'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C', 'V', 
                    'B', 'N', 'M', 'q', 'w', 'e', 'r', 't', 'y', 'i', 'o', 
                    'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'z', 'x',
                    'c', 'v', 'b', 'n', 'm', '0', '1', '2', '3', '4', '5',
                    '6', '7', '8', '9', '%', '!', '\'', '#', '$', '&', '\'',
                    '(', ')', '*', '.', ',', '+', '-', '@', '~'
            );
    public static final int ALPHABET_LENGTH = CHARACTERS.size();
}
