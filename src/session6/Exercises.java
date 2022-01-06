package session6;

import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main (String args[]){

        //Average
        IAverage average = values -> values.stream()
                                    .mapToInt(x -> x)
                                    .summaryStatistics()
                                    .getAverage();

        List<Integer> values1 = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.println("Average : "+average.calculate(values1));

        //Factorial
        IFactorial factorial = value -> {
            var res = 1;
            for(var i = 1; i <= value; i++ )
                res *= i;
            return res;
        };

        var result = factorial.calculate(5);
        System.out.println("Factorial : "+result);

        //Pairs
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

        //Higher Number from Array
        IHigherNumber1 higherNumber = values -> values.stream()
                                                .mapToInt((x) -> x)
                                                .summaryStatistics()
                                                .getMax();

        List<Integer> values2 = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.println("Higer number : "+higherNumber.calculate(values2));

        //Minor Number from Array
        IMinorNumber minorNumber = values -> values.stream()
                .mapToInt((x) -> x)
                .summaryStatistics()
                .getMin();

        List<Integer> values3 = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        var result2 = minorNumber.calculate(values3);
        System.out.println("Minor number : "+result2);

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

        IGenerateStringByNumber genereated = (word, number)->{
            var answer = "";
            for(var i = 0; i < number; i++ ){
                answer+=word;
            }
            return answer;
        };

        var result5 = genereated.generate("Hello",3);
        System.out.println("Generated String : "+result5);

    }
}
