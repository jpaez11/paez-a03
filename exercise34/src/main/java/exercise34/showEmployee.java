package exercise34;

import java.util.ArrayList;

public class showEmployee {
    //constructor
    public showEmployee(ArrayList<String> employee) {
        System.out.println("There are " + employee.size() + " employees: ");

        //here's to print the employees in the arraylist
        for(String empl:employee){
            System.out.println(empl);
        }
    }
}
