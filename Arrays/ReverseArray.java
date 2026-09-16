import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args){
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed array is: ");

        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            swap(arr, start,end);
            start++;
            end--;   
        }
    }

    static void swap(int[] arr, int start, int end){

            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }       
}
