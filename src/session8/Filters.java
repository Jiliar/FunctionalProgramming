package session8;

import java.util.ArrayList;
import java.util.List;

public class Filters {

    public static void main (String args[]){

        List<User> users = new ArrayList<>();

        users.add(new User("Rafael", 25));
        users.add(new User("Daniel", 20));
        users.add(new User("Tania", 15));
        users.add(new User("Luisa", 24));
        users.add(new User("Raul", 21));

        //Declarative paradigm
        //Filter: get count of users
        int counter1 = (int) users.stream().count();
        System.out.println("count of users : "+counter1);

        //Filter: get count of users with more than 18 years old
        //filter method return Stream
        int counter2 = (int) users.stream()
                                    .filter(user -> user.getAge() > 18)
                                    .count();
        System.out.println("count of users with more than 18 years old : "+counter2);

        //Filter: get count of users with more than 18 years old and his username starts with R
        //filter method return Stream
        int counter3 = (int) users.stream()
                .filter(user -> user.getAge() > 18)
                .filter(user -> user.getUsername().startsWith("R"))
                .count();
        System.out.println("count of users with more than 18 years old and his username starts with : "+counter3);
    }
}
