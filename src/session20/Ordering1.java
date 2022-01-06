package session20;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ordering1 {
    //Ordering numbers from a list
    public static void main (String args[]){

        List<Integer> numbers = List.of(1,4,6,8,9,2,4,6,7,8,10,1,2,3);

        //ASC Ordering
        List<Integer> result1 = numbers.stream()
                                        .sorted()
                                        .collect(Collectors.toList());
        System.out.println(result1);

        //DESC Ordering
        List<Integer> result2 = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(result2);
    }
}
