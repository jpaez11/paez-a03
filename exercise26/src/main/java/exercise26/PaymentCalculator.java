package exercise26;
import java.util.*;

public class PaymentCalculator {
    public static int calculateMonthsUntilPaidOff(double balance, double apr, double payment) {

        apr = apr / 365; //days of the year
        return (int) //to return the Math function below
                Math.ceil((-1 / 30.0) * Math.log(1 + balance / payment * (1 - Math.pow(1 + apr, 30))) / Math.log(1 + apr));

    }

}
