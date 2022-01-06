package session18;

import java.util.stream.Stream;

public class Reduce {

    //Element Reduction
    public static void main (String args[]){

        //Suma of elements
        int result1 = Stream.of(1,2,3,4,5,6,7,8,9,10)
                    .reduce(0 , (acumulador, element) -> acumulador + element);
        //Note: 0: starts with / acumulador increments 1
        System.out.println(result1);

        //String Concatenation
        String sep = " | ";
        String result2 = Stream.of("Java", "C", "Python", "Ruby")
                                .reduce("",(acumulador, lang)->acumulador +sep+lang)
                                .substring(sep.length());
        System.out.println(result2);

    }
}
