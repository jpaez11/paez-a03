package exercise24;

import java.util.Arrays;

public class forStrings {

    class ForStrings {

        static boolean isAnagram(String str1, String str2) { //this is how the strings work
            String st1 = str1.replaceAll("\\s", "");
            String st2 = str2.replaceAll("\\s", "");
            boolean stat = true; //anagrams or no anagrams?
            if (st1.length() != st2.length()) { //lengths don't match
                stat = false;

                //sets the arrays for the strings to work
            } else {
                char[] Array1 = st1.toLowerCase().toCharArray();
                char[] Array2 = st2.toLowerCase().toCharArray();
                Arrays.sort(Array1);
                Arrays.sort(Array2);
                stat = Arrays.equals(Array1, Array2);
            }
            if (stat) {
                return true; //anagram found
            } else {
                return false; //anagram not found
            }

        }
    }
}