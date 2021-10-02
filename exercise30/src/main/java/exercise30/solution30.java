package exercise30;

/*
  Pseudocode:
  using a nested for loop, this program will make a multiplication
  table. from 1-12 specifically.
   */
public class solution30 {
    public static void main(String[] args) {
        //making a for loop inside a for loop
        //feels weird not scanning user input
        for (int a = 1; a <= 12; a++) {
            for (int b = 1; b <= 12; b++) {
                System.out.print((a * b) + "\t"); //and this is how it becomes a table
            }
            System.out.println();//output displayed
        }
    }
}
