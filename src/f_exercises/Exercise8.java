package f_exercises;

import f_exercises.functional_interfaces.IGenerateStringByNumber;

public class Exercise8 {
    public static void main(String args[]){
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
