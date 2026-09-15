import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isArmstrong(n));
        
    }

    static boolean isArmstrong(int n){
        int original=n;
        int sum=0;

        while(n>0){

            int a=n%10;
            sum+=a*a*a;
            n/=10;
        }
        if(sum==original){
            return true;
        }else{
            return false;
        }

    }
    
}
