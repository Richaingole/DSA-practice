public class SearchInRange {

    public static void main(String[] args){
        int[] arr={3,56,-5,76,0,7,4};
        int target = 76;
        System.out.println(search(arr, target, 2,5));

    }

    static int search(int[] arr, int target, int start, int end){

        if(arr.length==0){
            return -1;
        }

        for(int index=start; index<end; index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
    
}

//output: 3
