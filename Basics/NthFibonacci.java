import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fibonacci number");
        int n = sc.nextInt();

        int a=0,b=1;
        int count=2;

        if(n==0){
            b=0;
        }
        else if(n==1){
            b=1;
        }else{

            while(count<=n){
                int temp=b;
                b=b+a;
                a=temp;
                count++;
            }
        }
        System.out.println(n+"th fibonacci number is "+b);
        sc.close();
    }
    
}
    
