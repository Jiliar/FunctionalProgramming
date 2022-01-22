package i_streams;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static void main (String args[]){

        //Creating a new Stream from Collections: Objects that implements List Interface
        List<User> users = new ArrayList<>();
        Stream<User> stream = users.stream(); // returns new Stream (Abstraction)

        //Creating a new Stream from another Stream
        Stream<User> filter = stream.filter(user -> user.getAge() > 18);

        //Creating a new Stream from array
        int[] numbers = {1,2,3,4};
        Stream numbersStream =  Stream.of(numbers);

        //Creating a new Stream from Secuence
        Stream names = Stream.of("Code 1", "Code 2", "Code 3");

        }
}
