package l_transforming_values;

import java.util.List;
import java.util.stream.Collectors;

public class TransformingValues {
    //Transforming values
    public static void main(String args[]){
        //Get square of all numbers of a list.
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> result = numbers.stream() //generating abstraction
                                      .map(num -> num * num) //transform data
                                      .collect(Collectors.toList()); //generating collection
        System.out.println(numbers);
        System.out.println(result);

        //Transforming String to Ints
        List<String> strings = List.of("1", "2", "3", "4");
        List<Integer> numbers2 = strings.stream()
                                        .map(character -> Integer.parseInt(character))
                                        .collect(Collectors.toList());
        System.out.println(strings);
        System.out.println(numbers2);

        //Other ways to transform Strings to numbers
        List<Integer> nums = List.of(1, 2, 3, 4);
        var numbers3 = nums.stream()
                .mapToDouble(character -> character)
                .average()
                .getAsDouble();
        System.out.println(numbers3);

    }
}
