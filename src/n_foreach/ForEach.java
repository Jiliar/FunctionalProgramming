package n_foreach;

import java.util.List;

public class ForEach {

    public static void main(String[] args){

        //forEach: Allow to perform operations with elements from a list
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(numbers);
        numbers.stream() //generating abstraction
                .map(num -> num * num) //transform data
                .forEach( num -> System.out.println(num)); //show data

        numbers.stream() //generating abstraction
                .forEach( num -> {
                    int result = num * num;
                    System.out.println(result);
                }); //show data
    }
}
