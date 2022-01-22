package f_exercises;

import f_exercises.functional_interfaces.IMinorNumber;

import java.util.Arrays;
import java.util.List;

public class Exercise5 {
    public static void main(String args[]){
        //EXERCISE 5

        //Minor Number from Array [Functional Interface]
        IMinorNumber minorNumber = values -> values.stream()
                .mapToInt((x) -> x)
                .summaryStatistics()
                .getMin();

        List<Integer> values3 = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        var result2 = minorNumber.calculate(values3);
        System.out.println("Minor number : "+result2);

        //Minor Number from Array
        double minorNumber2 = values3.stream()
                .mapToInt((x) -> x)
                .summaryStatistics()
                .getMin();

        System.out.println("Minor number : "+minorNumber2);
    }
}
