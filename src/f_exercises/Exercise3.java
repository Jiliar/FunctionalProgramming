package f_exercises;

import f_exercises.functional_interfaces.IPair;

public class Exercise3 {
    public static void main(String args[]){
        //EXERCISE 3

        //Pairs [Functional Interface]
        IPair pair = value -> {
            var res = "";
            if(value % 2 == 0)
                res = value+" is pair";
            else
                res = value+" is not pair";
            return res;
        };

        var isPair = pair.evaluate(2);
        System.out.println("Number is Pair? : "+isPair);
    }
}
