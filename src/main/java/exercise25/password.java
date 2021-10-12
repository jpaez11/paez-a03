package exercise25;
import java.io.*;
import java.util.*;

public class password {
    public static void Validation(String in)
    {
        // to check for all values
        int values = in.length();
        boolean hasLowerCase = false, hasUpperCase = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));

      //let's make the loop to check all of the values
        for (char i : in.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLowerCase = true;
            if (Character.isUpperCase(i))
                hasUpperCase = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }
        //checking that password strength
        if (hasDigit && hasLowerCase || hasUpperCase && specialChar
                && (values >= 8))
            System.out.println("Very Strong");
        else if ((hasLowerCase || hasUpperCase || specialChar)
                && (values >= 8))
            System.out.println("Strong");
        else if(hasLowerCase || hasUpperCase && (values < 8))
            System.out.print("Weak");
        else
            System.out.print("Very Weak");

    }
}

