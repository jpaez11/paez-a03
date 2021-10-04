/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jorge Paez
 */
package exercise31;
import java.util.*;
import java.lang.*;
import java.io.*;

/*
  Pseudocode:
  using the karvonean heart rate formula: TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
   the program will also make sure that only numerical numbers are entered, results will be neatly showed in
   a table.
   the process:
   scan user input(make sure it's only numerical)
   the percentages (55-95) are going to be placed in a loop
    results will be displayed as a table
   */

public class solution31 {
  public static void main (String[] args) throws java.lang.Exception{

    int heartRate, age;
    Scanner sca = new Scanner(System.in); //inputs for user
    System.out.print("Enter your heart rate: \n");
    heartRate = sca.nextInt();
    System.out.print("Enter your age: \n");
    age = sca.nextInt();

    int percentage =55;
    System.out.println("Intensity | Rate");
    System.out.println("-----------------------"); //the table is being formed

    //starting the loop
    while (percentage<96){
      int targetHeartRate = (heartRate * percentage - (220 - age)) + heartRate; //here's the formula being used
      System.out.println(percentage + "% |" + targetHeartRate + "beats per minute"); //table done
      percentage +=5;
    }

  }
}
