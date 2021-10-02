package exercise26;
import java.util.*;
/*
Pseudocode:
using the formula n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
the program will calculate the amount of months needed to pay of credit card debt
there will be a class named PaymentCalculator
with a public method called calculateMonthsUntilPaidOff, which returns the number of months.
the process:
first and foremost using Math, the formula will be calc'd
then a scanner for user input
and then the months will be calc'd and shown
 */

public class solution26 {

    public static void main(String[] args) {

        //scanning....(as well as initializing variables for the equation)
        Scanner sc = new Scanner(System.in);
        double balance, apr, pay; //made double to round to nearest cent

       //prompting user input for the values
        System.out.print("What is your balance? \n");
        balance = sc.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? \n");
        apr = sc.nextDouble();
        apr = apr / 100; //this is to calc the percentages

        System.out.print("What is the monthly payment you can make? \n");
        pay = sc.nextDouble();

        int mon = PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, pay);
        System.out.println("It will take " + mon + " months to pay off this card.");
    }
}


