import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number sequence: ");
        int n = sc.nextInt();

        System.out.println("Enter number to count: ");
        int a = sc.nextInt();

        int rem=0;
        int count=0;
        while(n>0){
            rem=n%10;
            if(rem==a){
                count++;
            }
            n/=10;
        }
        System.out.println("Number occurred "+count+" times.");
        sc.close();

    }
    
}
