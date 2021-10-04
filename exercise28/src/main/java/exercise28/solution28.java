/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jorge Paez
 */
package exercise28;
import java.util.*;
/*
   Pseudocode:
   5 scanned inputs will be read from the user
   those 5 inputs will be added up to a total number
   flowchart:
   start > the total = 0 > set an int variable = 0 > when that int is <5 it will prompt
   user to enter a number > when a number is inputted it will get the next input >
   total = total + number > variable = variable + 1 (until 5, if not it will cycle the prompt again)
   > demonstrates total output > end
    */
public class solution28 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int totalResult = 0;
        for(int x = 0; x < 5; x++){ //you wanna learn how to count to 5?
            System.out.print("Enter a number: \n");
            totalResult += sc.nextInt(); //here's how
        }
        System.out.println("The total is : " + totalResult + ".");
   }
}
