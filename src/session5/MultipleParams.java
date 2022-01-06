package session5;

public class MultipleParams {

    public static void main(String args[]){

        ISuma suma = (val1, val2) -> val1+val2;
        int resultado = suma.sumar(10,20);
        System.out.println(resultado);

        ISuma suma2 = (val1, val2) -> {
            int result = val1+val2;
            System.out.println("The answer within statement is "+result);
            return result;
        };

        int answer = suma2.sumar(100, 200);
        System.out.println(answer);
    }

}
