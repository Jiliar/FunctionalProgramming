package d_run_multiple_statements;

//Execute multiple statements
public class MultipleStatements {

    public static void main(String [] args){

        IHello greet1 = user -> System.out.println("Hello world "+user);
        greet1.sayHello("Code");

        IHello greet2 = user ->{
            if(user.equals("Code")){
                System.out.println("Hello Code!, nice to meet you");
            }else{
                System.out.println("Hello World "+user);
            }
        };
        greet2.sayHello("Code");
    }

}
