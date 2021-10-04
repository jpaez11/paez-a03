/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Jorge Paez
 */
/*
  Pseudocode
  this program will filter out results to find what is needed from a given data set
  this will be done by using a search string, it will be stored using maps
   */

//please help me, this is all spaghetti code, i want to learn what i did wrong, idk why it isn't working
package exercise40;
import java.util.*;
public class solution40 {
    public static Object main(String[] args) {
//maps
        TreeMap<Integer, solution40> employees = new TreeMap<>();

        //here's all the strings
         String fName;
         String lName;
         String position;
        String position2 = position;
        String position1 = position2;
        Date separationDate1 = separationDate1;
        Date separationDate;

//here's the construction
public solution40(String fName, String lName, String position1) {
            this.firstName = fName;
            this.lasstName = lName;
            this.position = position1;
        }
public solution40(String fName, String lName, String position1, Date separationDate1){
            this.firstName = fName;
            this.lasstName = lName;
            this.position = position1;
            this.separationDate = separationDate1;
        }
//setting and acquiring the names
        public String getFirstName () {
            return fName;
        }
        public void setFirstName(String fName){
            this.firstName = fName;
        }

        public String getlName() {
            return lName;
        }
        public void setlName(String lName){
            this.lName = lName;
        }

        public String getPosition() {
            return position1;
        }
        public void setPosition(String position2){
            this.position = position1;
        }

        public Date getSeparationDate () {
            return separationDate1;
        }
        public void setSeparationDate(Date){
            this.separationDate = separationDate1;
        }

//time to search
        public static int search(String name){
            int count = 0;
            for (int k : employees.keySet()) {
                if (employees.get(k).getfName().equalsIgnoreCase(name) || employees.get(k).getlName().equalsIgnoreCase(name)) {
                    count++;
                    System.out.println(employees.get(k));
                }
            }
            return count;
        }
    }
}
