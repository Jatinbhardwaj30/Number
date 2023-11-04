package Intenshipproject;

import java.util.Random;

import java.util.Scanner;
// java program to genrate the random password of given length and compexity?
public class task2 {
// function to genrate the password
public static String generatePassword(int length, int complexity) {
        // Create a list of all possible characters in the password.
        String characters = "";
        if (complexity >= 1) {
            characters += "abcdefghijklmnopqrstuvwxyz";
        }
        if (complexity >= 2) {
            characters += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if (complexity >= 3) {
            characters += "0123456789";
        }
        if (complexity >= 4) {
            characters += "!@#$%^&*()-+";
        }

        // Create a random object.

        Random random = new Random();

        // Generating the random  password.

        String password = "";

        for (int i = 0; i < length; i++) {
            password += characters.charAt(random.nextInt(characters.length()));
        }
// return the password.

        return password;
    }

    public static void main(String[] args) {
        // Generate a random password with  a given length and complexity .
        // taking inputs using Scanner class.

        Scanner sc=new Scanner(System.in);

        // length of the password?
System.out.println("enter the length");
        int l=sc.nextInt();

        // complexity of the password.
        System.out.println("enter the complexity");

        int c=sc.nextInt();
        // calling the function.
        String password = generatePassword(l, c);

        // Print the password.


        System.out.println(password);
    }
}    
