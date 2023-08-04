// Write a java program to count number of vowel and consonant in given 
// string.

import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        System.out.println("The number of vowels in the string is: " + vowels);
        System.out.println("The number of consonants in the string is: " + consonants);
    }
}