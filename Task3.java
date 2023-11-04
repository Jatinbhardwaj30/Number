package Intenshipproject;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 100) + 1;

        // Initialize the number of Guesses in a program
        int Guesses = 0;

        // Start the guessing loop
        Scanner scanner = new Scanner(System.in);
        while (Guesses < 10) {
            // take the user's guess
            System.out.print("Guess a number between 1 and 100: ");
            int Guess = scanner.nextInt();

            // Increment the number of guesses in a program
            Guesses++;

            // Check if the guess is correct or not

            if (Guess == number) {
                System.out.println("Correct!");
                break;
            }

            // Give the user a hint for correct guess

            if (Guess < number) {
                System.out.println("Your guess is too low.");
            } 
            else if (Guess > number) {
                System.out.println("Your guess is too high.");
            }
        }

        // If the user has not guessed the number in 10 guesses, print a message for the user.

        if (Guesses == 10) {
            System.out.println("You have run out of guesses.");
    }
}
}

  
