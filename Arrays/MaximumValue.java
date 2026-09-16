import java.util.Arrays;

public class MaximumValue {

    public static void main(String[] args){
        int [] arr = {34, 78, 45, 77, 33, 6, 35, 84};
        System.out.println(max(arr));

        System.out.println(maxRange(arr, 2, 6));
    }

    static int max(int[] arr){                 //find maximum value in whole array
        int maxVal=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] arr, int start, int end){        //finding maximum value in a given range of an array
        int maxVal=arr[start];
        for(int i=start; i<end; i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    
}
