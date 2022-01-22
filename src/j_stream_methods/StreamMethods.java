package j_stream_methods;

import h_filters.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main (String args[]){
        List<User> users = new ArrayList<>();

        users.add(new User("Rafael", 25));
        users.add(new User("Daniel", 20));
        users.add(new User("Tania", 15));
        users.add(new User("Luisa", 24));
        users.add(new User("Raul", 21));

        Stream<User> stream = users.stream();

        //Type of methods
        // Process
        //Internal Interaction

        //Method that returns a new Stream
        //Filter return one Abstraction -> New Stream (Process)
        //System.out.println(stream.filter(user -> user.getAge() > 18));

        //Method that returns a specific value
        //Filter return one Abstraction -> Value (Internal Interaction)
        System.out.println(stream.filter(user -> user.getAge() > 18).count());

    }
}
