package session2;

import session2.ISaludar;

//Functional Interface applicability
public class FunctionalInterfacePractice {

    public static void main(String [] args){

        //Define how can i do it through of Lambda function
        ISaludar saludar = () -> {System.out.println("Hello world");};
        //Call function
        saludar.Saluda();
    }

}
