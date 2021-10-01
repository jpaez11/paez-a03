package exercise24;
import org.junit.jupiter.api.Test;
import java.util.*;
          /*
    Pseudocode:
    making a program that will use arrays to tell if words are anagrams
    or not, by using strings!
    the process for this will be:
    prompt user to give the two strings which will be scanned,
    those two stings will be checked by another class (just to see if they are anagrams)
    a comparison will take place in it, for two different outputs
    one output will be to see if the strings are anagrams
    the other input will be to say that they are not anagrams
        */

public class solution24 {


        public static void main(String[] args) { //main class to check anagrams
            Scanner sc= new Scanner(System.in); //scanning...
            //the prompt
            System.out.println("Enter two strings and let's see if they're anagrams: \n");

            //user please input the strings
            System.out.print("Enter the first string: \n");
            String str1=sc.nextLine();
            System.out.print("Enter the second string: \n");
            String str2=sc.nextLine();

            //let's check those anagrams
            if(forStrings.ForStrings.isAnagram(str1,str2))
                System.out.println(str1 + " and " + str2 + " are anagrams");
            else
                System.out.println(str2 + " and " + str2 + " are not anagrams");

        }
    }

