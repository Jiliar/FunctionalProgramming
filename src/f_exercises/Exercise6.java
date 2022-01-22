package f_exercises;

import f_exercises.functional_interfaces.IMostRepeated;

public class Exercise6 {
    public static void main(String args[]){
        //EXERCISE 6
        //The most repeated number
        IMostRepeated mostRepeated = numbers ->{
            var number = 0;
            var max = 0;
            for(int i = 0; i < numbers.length; i++){
                var pos = 0;
                for(int j = 0; j < numbers.length; j++){
                    if(numbers[i] == numbers[j]){
                        pos++;
                    }
                }
                if(pos > max){
                    number = numbers[i];
                    max = pos;
                }
            }
            return number;
        };

        int[] values4 = {2, 3, 5, 11, 11, 13, 17, 19, 23, 29};
        var result3 = mostRepeated.calculate(values4);
        System.out.println("The most repeated number : "+result3);
    }
}
