package session3;

//Jobs with parameters
public class JobWithParams {

    public static void main(String [] args){

        //Define how can I do it through of Lambda function
        /*If we can work with lambda functions with params, compiler infers params type,
        also you can remove parenthesis and brackets*/
        //ISaludar saludar = (String usuario) -> {System.out.println("Hello world "+usuario);};
        ISaludar saludar = usuario -> System.out.println("Hello world "+usuario);
        //Call function
        saludar.Saluda("Code");
    }

}
