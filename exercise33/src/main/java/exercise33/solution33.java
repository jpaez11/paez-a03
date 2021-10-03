/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jorge Paez
 */
package exercise33;
import java.util.*;

/*
  Pseudocode:
      this program will make a magic 8ball that will give randomly
      stored answers
   */
public class solution33 {
  public static void main (String [] args){
      //responses to be stored and given randomly

      String[] responses = {"No", "Yes", "Ask again later", "Maybe"};
      Random rng = new Random(); //it's random innit?
      Scanner sca = new Scanner(System.in);

      System.out.println("What is your question?");
      String ask = sca.nextLine(); //here's the question

      //here's how the options will be selection
      int randomResponses = rng.nextInt(responses.length);
      String result = responses[randomResponses];

      //printing the responses
      System.out.println();
      System.out.println(result);
      System.out.println();
  }
}
