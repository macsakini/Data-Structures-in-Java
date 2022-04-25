import java.util.*;

class binarysearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 1;
        int l = 0;
        binarysearch(arr, target, l);
    }
    
    public static int binarysearch(int[] arr, int target, int l) {
        int n = (int) arr.length;

        int mid = (int) Math.ceil((arr.length)/2);
        
        if(target ==arr[mid]){
            return arr[mid];
        }
        else{
            while(l < 4){
                if(target < arr[mid]){ 
                    int[] x = sliceArray(arr, 0, mid);
                    binarysearch(x, target, l);
                    l = l + 1;
                }else{
                    int[] x = sliceArray(arr, mid, n-1);
                    binarysearch(x, target, l);
                    l = l + 1;
                }
            }
        }
        System.out.println(arr[mid]);
        return arr[mid];
    }
    public static int[] sliceArray(int array[], int startIndex, int endIndex ){
        int size = endIndex - startIndex;
        int part[] = new int[size];
        for(int i = 0; i < part.length; i++){
           part[i] = array[startIndex + i];
        }
        return part;
     }
}

