/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jorge Paez
 */
package exercise35;
import java.util.*;

public class solution35 {
    /*
    Pseudocode:
    making an arrayList, using the random function, as well as scanning user input
    a winner will be selected at random by using a loop
     */
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String winner = null;
        ArrayList<String> listofNames = new ArrayList<String>();//storing the names

        //loop to pick out the names
        do {
            System.out.println("Enter a name: ");
            winner = scanner.nextLine(); //grabbing the name

            //adding the winner to the arrayList, only if empty/not empty
            if (winner.isBlank() && !winner.isEmpty())
                listofNames.add(winner);
        } while (!winner.isBlank() && !winner.isEmpty());

        //rng to grab winner
        Random rng = new Random();
        int rngIndex = rng.nextInt(listofNames.size());

        //and the winner is....
        System.out.println("The winner is..... " + listofNames.get(rngIndex));
    }
}
