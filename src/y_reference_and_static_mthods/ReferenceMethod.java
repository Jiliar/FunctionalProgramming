package y_reference_and_static_mthods;

import java.util.Arrays;
import java.util.List;

public class ReferenceMethod {

    //Reference Method
    public static void main (String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Reference Method
        list.stream()
                .map(StaticMethod::toCube)
                .forEach(System.out::println);
    }

    public static int toCube(int numero){
        return numero * numero * numero;
    }
}
