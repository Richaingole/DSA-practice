import java.util.Scanner;

class ReverseNumber{
    public static void main(String[] args){
        System.out.println("Enter the number series: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int newno=0;
        
        while(n>0){
            int rem=n%10;
            n/=10;
            newno = newno*10+rem;
        }

        System.out.println("Reverse number is "+newno);
    }
}
