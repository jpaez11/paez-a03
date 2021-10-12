/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jorge Paez
 */
package exercise29;
import java.util.*;

    /*
    Pseudocode:
    using the formula years = 72 / r, the program
    will be a quick calculator that will prompt user on a
    return in investment. it will also not allow user to enter
    wrong inputs.
    the process:
    scanning the user inputs
    making a loop to trap any wrong inputs
    and a try and catch method for any exception
     */

public class solution29 {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in); //hello user!
        boolean wrongInput = false; //this is to have the loop condition for wrong inputs

        //loop start
        while(true){
            try {
                //prompt for the return
            System.out.print("What's the rate of return?");
            int rate= Integer.parseInt(sca.next()); //here's the interest rate
            System.out.println("It'll take this many" + (72/rate) + "years to double your first investment. ");
            wrongInput = true; //if the exception don't happen
            }
            catch (NumberFormatException exception){ //that input is wrong!!
                System.out.println("Sorry. Not a valid input!");
            }
            catch(ArithmeticException exception){ //here's division, but wrong and caught by exception
                System.out.println("Sorry. Not a valid input!");
            }
            if(wrongInput){ //if everything goes according to plan
                break; //and this kills the loop
            }
        }
    }

}

