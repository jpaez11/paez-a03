/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jorge Paez
 */
package exercise34;
import java.util.*;
/*
 Pseudocode:
 making an arraylist of employees, the program will figure out
 which one to remove
  */
public class solution34 {
    public static void main(String[] args) {
        ArrayList<String> employee = new ArrayList<String>(Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));
        new showEmployee(employee); //print the employees
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter an employee name to remove: " );
        String removal = scanner.nextLine(); //removing an employee
        employee.remove(removal); //here's to remove an arrayList

        System.out.println();
        new showEmployee(employee);

    }
}
