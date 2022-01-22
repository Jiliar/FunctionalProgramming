package f_exercises;

import f_exercises.functional_interfaces.IHigherNumber1;

import java.util.Arrays;
import java.util.List;

public class Exercise4 {
    public static void main(String args[]){
        //EXERCISE 4

        //Higher Number from Array [Functional Interface]
        IHigherNumber1 higherNumber = values -> values.stream()
                .mapToInt((x) -> x)
                .summaryStatistics()
                .getMax();

        List<Integer> values2 = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.println("Higher number : "+higherNumber.calculate(values2));

        //Higher Number from Array
        double higherNumber2 = values2.stream()
                .mapToInt((x) -> x)
                .summaryStatistics()
                .getMax();
        System.out.println("Higher number : "+higherNumber2);
    }
}
