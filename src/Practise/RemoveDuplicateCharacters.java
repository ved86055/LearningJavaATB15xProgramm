package Practise;

import java.util.*;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {

        String input = "cd is very good company cd is also very good app company";

        // Remove spaces if you want only characters
        String cleanInput = input.replace(" ", "");

        Set<Character> set = new LinkedHashSet<>();

        for (char ch : cleanInput.toCharArray()) {
            set.add(ch);
        }

        // Print result
        for (char ch : set) {
            System.out.print(ch);
        }
    }
}
