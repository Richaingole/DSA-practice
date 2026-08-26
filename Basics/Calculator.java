import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int result=0;

        while(true){

            System.out.println("Enter the operator: ");
            char op = sc.next().trim().charAt(0);


            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.println("Enter two numbers: ");
                int num1=sc.nextInt();
                int num2=sc.nextInt();

                if(op=='+'){
                    result=num1+num2;   
                }
                if(op=='-'){
                    result=num1-num2;
                }
                if(op=='*'){
                    result=num1*num2;
                }
                if(op=='/'){
                    if(num2!=0){
                        result=num1/num2;
                    }else{
                        System.out.println("Cannot be divided by 0!");
                        continue;
                    }
                }
                if(op=='%'){
                    if(num2!=0){
                        result=num1%num2;
                    }else{
                        System.out.println("Cannot be divided by 0!");
                        continue;
                    }
                }
            } else if(op=='X' || op=='x'){
                break;
            }else{
                System.out.println("Invalid operation!!!!!");
            }
        
            System.out.println("Result is "+result);
        }
        sc.close();
    }
    
}
