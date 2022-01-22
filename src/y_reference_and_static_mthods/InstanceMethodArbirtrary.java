package y_reference_and_static_mthods;

import java.util.ArrayList;
import java.util.List;

class InstanceMethodArbirtrary {

    public static void main (String[] args){
        List<User> users = new ArrayList<>();

        users.add(new User("Rafael", 25));
        users.add(new User("Daniel", 20));
        users.add(new User("Tania", 15));
        users.add(new User("Luisa", 24));
        users.add(new User("Raul", 21));

        users.stream()
                .map(User::getName)
                .forEach(System.out::println);
    }

}

class User{

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}