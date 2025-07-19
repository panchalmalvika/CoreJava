package Test.first;

import java.util.Random;
import java.util.Scanner;

public class Game {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int numberToGuess = random.nextInt(100) + 1; // number between 1 and 100
	        int numberOfTries = 0;
	        int guess = 0;
	        boolean hasGuessedCorrectly = false;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

	        while (!hasGuessedCorrectly) {
	            System.out.print("Enter your guess: ");
	            guess = scanner.nextInt();
	            numberOfTries++;

	            if (guess < numberToGuess) {
	                System.out.println("Too low! Try again.");
	            } else if (guess > numberToGuess) {
	                System.out.println("Too high! Try again.");
	            } else {
	                hasGuessedCorrectly = true;
	                System.out.println("Correct! You guessed the number in " + numberOfTries + " tries.");
	            }
	        }

	        scanner.close();
	    }
	}


