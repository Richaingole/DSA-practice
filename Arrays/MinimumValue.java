public class MinimumValue {

    public static void main(String[] args){
        int[] arr = {3,67,4,-9,233,54,77};

        System.out.println(minimum(arr));

    }

    static int minimum(int[] arr){
        int ans=arr[0];

        for(int i=1; i<arr.length; i++){
            if(ans>arr[i]){
                ans=arr[i];
            }
        }
        return ans;
    }
    
}

//Output: -9
