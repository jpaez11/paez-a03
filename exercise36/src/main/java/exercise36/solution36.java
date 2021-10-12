/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jorge Paez
 */
package exercise36;
import java.util.*;
import java.util.stream.Collectors;
import static exercise36.calcStats.average;
import static exercise36.calcStats.std;
import static java.util.Collections.max;
    /*
    Pseudocode:
    using functions called average, max, min, and std (in a list) will return
    results of statistics. loops and arrays will be used for the mathematical
    equations to function. program will also ignore nonvalid inputs.
     */

public class solution36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>(); //list of #s
        String enter = null;
        int min;

        //let's make the loop
        do {
            System.out.println("Enter a number: ");
            enter = scanner.next(); //this is the input

            if (!enter.equals("done")) {//when the input isn't done
                try {//parsing it into integer
                    int numbers = Integer.parseInt(enter); //parsing
                    num.add(numbers);//if it's parsable, add
                } catch (NumberFormatException NFE) {
                }
                //no more adding
            }
        } while (!enter.equals("done")); //as long as done isn't entered

        System.out.println("Numbers: "+num.stream().map(String::valueOf).collect(Collectors.joining(",")));
        System.out.println("The average is "+average(num);
        System.out.println("The minimum is "+min (num));
        System.out.println("The maximum is "+max(num));
        System.out.println("The standard deviation is "+String.format("%.2f", std(num)));

    }

    private static void min(ArrayList<Integer> num) {
    }
}

