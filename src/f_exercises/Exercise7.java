package f_exercises;

import f_exercises.functional_interfaces.IHigherNumber2;

public class Exercise7 {
    public static void main(String args[]){
        //Higher Number from Three params
        IHigherNumber2 higherNumber2 = (value1, value2, value3) ->{
            var answer = 0;
            if(value1 >= value2 && value1 >= value3)
                answer = value1;
            else if(value2 >= value1 && value2 >= value3)
                answer = value2;
            else
                answer = value3;
            return answer;
        };
        var result4 = higherNumber2.calculate(2,3,4);
        System.out.println("Higer number : "+result4);
    }
}
