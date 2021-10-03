package exercise33;

import org.junit.jupiter.api.Test;
import java.util.Random;

public class EBall{
    public EBall() { //constructor
        //responses to be stored and given randomly
        String[] responses = {"No", "Yes", "Ask again later", "Maybe"};
        Random rng = new Random(); //it's random innit?
    }
    public String shake(){
        String[] responses = {"No", "Yes", "Ask again later", "Maybe"};
        Random rng = new Random();
        return responses[rng.nextInt(3)]; //selecting random answer and return
    }
}
