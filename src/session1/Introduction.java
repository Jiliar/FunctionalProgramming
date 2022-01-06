package session1;
import java.util.List;
public class Introduction {

    public static void main(String[] args){
        //get elements higher than 10.
        List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);

        //Imperative mode
        int counter = 0;
        for(int number: numbers){
            if(number > 10){
                counter++;
            }
        }
        System.out.println(counter);

        //Declarative mode
        Long result = numbers.stream().filter(n -> n > 10).count();
        System.out.println(result);
    }
}
