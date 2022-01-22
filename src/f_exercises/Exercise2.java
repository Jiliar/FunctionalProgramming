package f_exercises;

import f_exercises.functional_interfaces.IFactorial;

public class Exercise2 {
    public static void main(String args[]){
        //EXERCISE 2

        //Factorial [Functional Interface]
        IFactorial factorial = value -> {
            var res = 1;
            for(var i = 1; i <= value; i++ )
                res *= i;
            return res;
        };

        var result = factorial.calculate(5);
        System.out.println("Factorial : "+result);
    }
}
