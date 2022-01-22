package q_math_functions;

import java.util.List;

public class MathFunctions {
    //Math functions
    public static void main (String args[]){

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        Long quantity = numbers.stream().count(); //get count from a list
        System.out.println(quantity);

        //Suma
        int suma = numbers.stream().mapToInt(n -> n).sum();
        System.out.println(suma);

        //Average
        double average = numbers.stream().mapToInt(n -> n).average().orElse(0);
        System.out.println(average);

        //min
        double min = numbers.stream().mapToInt(n -> n).min().getAsInt();
        System.out.println(min);

        //max
        double max = numbers.stream().mapToInt(n -> n).max().getAsInt();
        System.out.println(max);

    }
}
