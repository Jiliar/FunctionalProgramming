package s_unique_elements;

import java.util.List;

public class UniqueElements {
    //Unique elements
    public static void main (String args[]){
        //Print in console every unique names from a list
        List<String> names = List.of("Code 1", "Code 2", "Code 1", "Code 3");
        names.stream()
              .distinct()//return unique items from list
              .forEach(element -> System.out.println(element));
        ;
    }
}
