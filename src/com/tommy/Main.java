package com.tommy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        try {

            System.out.println("Let's play a Guessing Game!\nSee if you can guess the number I've chosen between 1 and 10\nWhat is your guess?:");
            int playerNum = scan.nextInt();
                if (playerNum == 7) {
                    System.out.println("Wow! You are correct");
                } else System.out.println("Nope, sorry.\nBetter luck next time.");

            System.out.println("\nNow, lets check your testing grades");

        try {
            Thread.sleep(2000);
            } catch (Exception ignored) {
           }

            System.out.println("What was your last test score?");
            int num = scan.nextInt();
            if (num >= 60) {
                System.out.println("Good score! You're doing great!");
            } else {
                System.out.println("Sorry, I think you need to study some more.");
            }

        }  catch(InputMismatchException e){
            System.err.println("Please enter number values only.");
        }


        }
    }

