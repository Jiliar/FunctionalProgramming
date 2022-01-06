package session4;

import session4.ISaludar;

//Execute multiple statements
public class MultipleStatements {

    public static void main(String [] args){

        ISaludar saludar = usuario -> System.out.println("Hello world "+usuario);
        saludar.Saluda("Code");

        ISaludar saludar2 = usuario ->{
            if(usuario.equals("Code")){
                System.out.println("Hello Code!, nice to meet you");
            }else{
                System.out.println("Hello World "+usuario);
            }
        };
        saludar2.Saluda("Code");
    }

}
