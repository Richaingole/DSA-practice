import java.util.Scanner;

public class SwappingUsingPassByValue{
    public static void main(String[] args){

        System.out.println("Enter two numbers.");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        swap(a, b);


    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1+ " "+ num2);
    }
}

//Java always passes a copy of the value to a method, so changes made to the method parameters do not affect the original primitive variables. Hence Java follows the concept of Pass By Value.
