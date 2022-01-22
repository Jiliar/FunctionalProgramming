package m_flat_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args){

        //flatMap: Combining Lists
        List<String> name1 = Arrays.asList("Code 1","Code 2");
        List<String> name2 = Arrays.asList("Code 3","Code 4");
        List<String> name3 = Arrays.asList("Code 5","Code 6");

        List<String> result = Stream.of(name1, name2, name3)
                            .flatMap( element -> element.stream())
                            .collect(Collectors.toList());

        System.out.println(result);
    }
}
