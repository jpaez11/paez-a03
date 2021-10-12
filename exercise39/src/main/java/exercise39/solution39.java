/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jorge Paez
 */
package exercise39;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
/*
Pseudocode:
using a map, a data set will be sorted by last name
and will be printed in a table.
 */
public class solution39 {
    public static void main(System [] args) {

        //here's how the employees class is being called and the names become sorted
        Employees[] employees = {
                new Employees("John", "Johnson", "Manager", 20161231),
                new Employees("Tou", "Xiong", "Software Engineer", 20161005),
                new Employees("Michael", "Michelson", "District Manager", 20151219),
                new Employees("Jake", "Jacobson", "Programmer", 00000000),
                new Employees("Jacquelyn", "Jackson", "DBA", 00000000),
                new Employees("Sally", "Webber", "Web Developer", 20151218)
        };

        //all the employees listed out
        List<Employees> list = Arrays.asList(employees);

        //showing all the employees
        System.out.print("Complete Employee list:");
        list.stream().forEach(System.out::println);


        //acquiring full names of employees
        Function<Employees, String> byFirstName = Employees::getFirstName;
        Function<Employees, String> byLastName = Employees::getLastName;

        //this is to compare last and first name
        Comparator<Employees> lastFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);

        //alphabetically displaying the employees
        System.out.print("Employees in ascending order by last name then first: ");
        list.forEach((Consumer<? super Employees>) lastFirst);
    }
}


