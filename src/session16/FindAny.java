package session16;

import java.util.ArrayList;
import java.util.List;

public class FindAny {


    public static void main(String[] args){

        List<User> users = new ArrayList<>();
        users.add(new User("Rafael", 25));
        users.add(new User("Daniel", 20));
        users.add(new User("Tania", 15));
        users.add(new User("Luisa", 24));
        users.add(new User("Raul", 21));

        //Get one element with findAny() and get()
        //Get username that have 25 years old
        User user1 = users.stream()
                        .filter(u -> u.getAge() == 25)
                        .findAny()
                        .get();

        System.out.println(user1.getUsername());

        //Get one element with findFirst() and get()
        //Get username that first element
        User user2 = users.stream()
                .filter(u -> u.getAge() == 25)
                .findFirst()
                .get();

        System.out.println(user2.getUsername());

        //what happens if an element does not meet the filter
        User user3 = users.stream()
                .filter(u -> u.getAge() == 25)
                .findAny()
                .orElse(new User("N/A", 0));

        System.out.println(user3.getUsername());
    }
}
