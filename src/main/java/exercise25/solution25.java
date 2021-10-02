package exercise25;
import java.io.*;
import java.util.*;
/* Psuedocode
 making two classes to check if a password is weak - very strong,
 it's also gotta detect special characters, lowercase and uppercase,
 letters, and numbers!
 the process will use:
 a for loop (with a couple of if statements)
 and an arraylist to organize the different values (special chars, lowercase letters, etc.)
 another class for which to read the password and validate it
 scanning the user's inputs
  */
public class solution25 {
    public static void main(String[] args)
    {
        //this is where one checks the password strength
        String input;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Password: \n");
        input=sc.nextLine();
        password.Validation(input);
    }
}
