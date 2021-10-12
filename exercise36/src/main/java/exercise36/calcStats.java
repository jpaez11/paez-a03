package exercise36;
import java.util.*;

public class calcStats {
    public static double average(ArrayList<Integer> num){
        int result =0;
        for (int numbers: num){
            result += numbers;
        }
            double averg = (double)(result)/num.size();
            return averg;
    }

    public static void max(ArrayList<Integer> num) {
        int max = num.get(0);
        for (int numbers : num){
            if (num < min)
                min = numbers;
    }
        return min;
}
    public static double std(ArrayList<Integer> numbers) {
        double mean = average(numbers);

        double sum = 0;
        for(int num: numbers) {
            sum = sum + Math.pow((num-mean), 2);
        }
        double stdDev = Math.sqrt(sum/numbers.size()); //here's the formulas

        return stdDev;
    }

}