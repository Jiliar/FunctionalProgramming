package c_work_with_params;

//Jobs with parameters
public class JobWithParams {

    public static void main(String [] args){

        //Define how can I do it through of Lambda function
        /*If we can work with lambda functions with params, compiler infers params type,
        also you can remove parenthesis and brackets*/
        //IHello greet = (String user) -> {System.out.println("Hello world "+user);};
        c.run_multiple_statements.IHello greet = user -> System.out.println("Hello world "+user);
        //Call function
        greet.sayHello("Code");
    }

}
