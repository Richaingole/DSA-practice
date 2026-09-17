import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args){
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter "+size+" array elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        System.out.println("Target found at index "+linearSearch(arr, target));
        sc.close();

    }

    static int linearSearch(int[] arr, int target){

        if(arr.length==0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;

    }
    
}
