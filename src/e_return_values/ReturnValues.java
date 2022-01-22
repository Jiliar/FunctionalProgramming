package e_return_values;

public class ReturnValues {

    public static void main(String args[]){

        ISum sum = (val1, val2) -> val1+val2;
        int result1 = sum.doSum(10,20);
        System.out.println(result1);

        ISum sum2 = (val1, val2) -> {
            int result2 = val1+val2;
            System.out.println("The answer within statement is "+result2);
            return result2;
        };

        int result3 = sum2.doSum(100, 200);
        System.out.println(result3);
    }

}
