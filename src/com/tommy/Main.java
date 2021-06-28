package com.tommy;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {

            System.out.println("Let's play a Guessing Game!\nSee if you can guess the number I've chosen between 1 and 10\nWhat is your guess?");
            // The number I've chosen is 7
            int playerNum = scan.nextInt();
                if (playerNum == 7) {
                    System.out.println("Wow! You are correct");
                } else System.out.println("Nope, sorry.\nThe correct answer was, 7.\nBetter luck next time.");

            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {
            }

            System.out.println("\nNow, lets see how your studies are going.\nWhat was your last test score?");
            int num = scan.nextInt();
            if (num >= 60) {
                System.out.println("Good score! You're doing great!");
            } else {
                System.out.println("Sorry, I think you need to study some more.");
            }

            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {
            }

            System.out.println("\nNow, let's try the Guessing Game again.\nThis time I've chosen a number between 1 and 100!\nWhat is your guess?");
            // The number I've chosen 68
            int playerNum2 = scan.nextInt();

            if (playerNum2 == 68) {
                System.out.println("Wow! That is correct");
            }
            if (playerNum2 > 63 && playerNum2 < 68) {
                System.out.println("Oh! So Close!\nThe correct answer is 68.");
            } else if (playerNum2 != 68) {
                System.out.println("Nope, sorry.\nThe correct answer is 68.\nBetter luck next time.");
            }

        } catch(InputMismatchException e){
            System.err.println("Please enter number values only.");
        }

            try {
                Thread.sleep(1500);
            } catch (Exception ignored) {
            }

            System.out.println("\nFinally let's talk about animals\nName an animal and I'll tell you the sound it makes.\nName an animal...");
            String userAnimal = scan.next();
           if (userAnimal.equalsIgnoreCase("Tiger")) {
                System.out.println("Tiger goes: Roar!");
            } else if (userAnimal.equalsIgnoreCase("Pig")) {
                System.out.println("Pig goes: Oink!");
            } else if (userAnimal.equalsIgnoreCase("Horse")) {
                System.out.println("Horse goes: Neigh!");
            } else if (userAnimal.equalsIgnoreCase("Cow")) {
                System.out.println("Cow goes: Moo!");
            } else if (userAnimal.equalsIgnoreCase("Chicken")) {
                System.out.println("Chicken goes: Cluck!");
            } else {
                System.out.println("Sorry, I don't know that animal...\nThanks for playing.");
            }

        }
    }

