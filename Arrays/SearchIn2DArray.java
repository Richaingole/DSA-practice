import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args){

        int[][] arr = {
            {23,77,5,3},
            {4,78},
            {999,23,5},
            {7,99,1,66,2}
        };
        int target=23;
        int[] ans=search(arr, target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(target==arr[row][col]){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
    
}

//output: [2, 1]
