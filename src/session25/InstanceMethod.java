package session25;

import java.util.Arrays;
import java.util.List;

class InstanceMethod {

    //Instance Method
    public static void main (String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Reference Method
        list.stream()
                .map(new Calculator()::toCube)
                .forEach(System.out::println);
    }
}

class Calculator{
    public int toCube(int numero){
        return numero * numero * numero;
    }
}
