package session25;

import java.util.Arrays;
import java.util.List;

public class StaticMethod {

    // Static Method
    public static void main (String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Static Method
        list.stream()
                .map(number -> StaticMethod.toCube(number))
                .forEach(value -> System.out.println(value));
        System.out.println("------------------------");

        //Reference Method
        list.stream()
                .map(StaticMethod::toCube)
                .forEach(System.out::println);
    }

    public static int toCube(int numero){
        return numero * numero * numero;
    }

}
