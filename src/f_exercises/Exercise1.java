package f_exercises;

import f_exercises.functional_interfaces.IAverage;

import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    public static void main(String args[]){
        //EXERCISE 1
        //Average [Functional Interface]
        IAverage average = values -> values.stream()
                .mapToInt(x -> x)
                .summaryStatistics()
                .getAverage();

        List<Integer> values1 = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.println("Average : "+average.calculate(values1));

        //Average
        List<Integer> valuesx = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        double average1 = valuesx.stream()
                .mapToInt(x -> x)
                .summaryStatistics()
                .getAverage();

        System.out.println("Average : "+average1);
    }
}
