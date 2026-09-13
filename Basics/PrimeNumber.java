import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean num = primeNo(n);
        System.out.println(num);

    }

    static boolean primeNo(int n){

        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c * c > n;

    }
    
}
