package b.work_with_params;

//Functional Interface applicability
public class FunctionalInterfacePractice {

    public static void main(String [] args){

        //Define how can I do it through of Lambda function
        b.work_with_params.IHello greet = () -> {System.out.println("Hello world");};
        //Call function
        greet.sayHello();
    }

}
