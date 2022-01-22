package z_constructor_by_reference;

import java.util.ArrayList;
import java.util.List;

public class ConstructorByReference {
    public static void main(String[] args){
        List<User> users = new ArrayList<>();
        IUser iUser = User::new;
        User user1 = iUser.create("Codi1", 1);
        User user2 = iUser.create("Codi2", 2);
        User user3 = iUser.create("Codi3", 3);
        User user4 = iUser.create("Codi4", 4);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        users.stream().map(User::toString).forEach(System.out::println);
    }
}