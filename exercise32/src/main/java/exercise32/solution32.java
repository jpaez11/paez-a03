package exercise32;
import java.util.*;
/*
   Pseudocode:
   let's guess some numbers, but not allow the user to input non
   numerical values. like never during the program, except when they
   want to not guess anymore numbers. this game will consist of 3 levels,
   the 1st one would only feature 1-10, the 2nd one would be btwn 1-100,
   and the last one would be btwn 1-1000.
   the process:
   scanning user input
   making a while loop for the game to run
   a break clause to end the loop
   randomizing numbers for all difficulties
    */
public class solution32 {
    public static void main (String [] args) {
        //scanning user input, and prompting them to play
        int number, guesses, point, result = 0;
        System.out.println("Let's play Guess the Number! ");
        number = (int) (Math.random() * 999 + 1); //rng right here
        Scanner sca = new Scanner(System.in);

        //and thus begins the loop
        while (true) {
            result = 0;
            System.out.println("What difficulty do you prefer? (1 for easy, 2 for medium, 3 for hard");
            point = sca.nextInt(); //selection

            //let's check the options
            if (point == 1)
                number = (int) (Math.random() * 10 + 1); //easy rng
            else if (point == 2)
                number = (int) (Math.random() * 100 + 1); //medium rng
            else
                number = (int) (Math.random() * 1000 + 1); //hard rng
            System.out.println("I have selected a number, what's your guess?");
        }
        //let's gather up the guesses
        do {
            guesses = sca.nextInt();
            result++; //here's the end result of the guesses
            if (guesses == number)
                System.out.println("You have figured it out in " + result + "guesses!");
            else if (guesses < number)
                System.out.println("Too low. Guess again: ");
            else if (guesses > number)
                System.out.println("Too high. Guess again: ");
        } while (guesses != number);
        System.out.print(" \n Play again? (Y/N)");
           char choice = sca.next().charAt(0); //yes or no?
        if (choice == 'N' || choice == 'n'){
         break;
        }

            //this to close the loop
    }


}
