package g_imperative_vs_declarative;

import java.util.ArrayList;
import java.util.List;

public class ImperativeVsDeclarative {

    public static void main (String args[]){
        List<User> users = new ArrayList<>();

        users.add(new User("Rafael", 25));
        users.add(new User("Daniel", 20));
        users.add(new User("Tania", 15));
        users.add(new User("Luisa", 24));
        users.add(new User("Raul", 21));

        //Imperative paradigm
        int counter = 0;
        for(User user: users){
            if(user.getAge() > 18)
                counter++;
        }
        System.out.println(counter);

        //Declarative paradigm
        counter = (int) users.stream()
                             .filter(user -> user.getAge() > 18)
                             .count();
        System.out.println(counter);
    }
}
