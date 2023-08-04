// Write a java program to illustrate the concept of NullPointerException and 
// NumberFormatException

import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Try-catch block to handle NullPointerException
        try {
            String str = null;
            System.out.println("The length of the string is: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        // Try-catch block to handle NumberFormatException
        try {
            String numberString = "abc";
            int number = Integer.parseInt(numberString);
            System.out.println("The number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}