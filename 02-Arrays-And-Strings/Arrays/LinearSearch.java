import java.util.*;
public class LinearSearch {

    //Searching in a 1D Array
    /* 
    public static void main(String[] args){
        int[] arr = {33,25,68,46,90,26,19};
        int res = linear(arr, 90);
        System.out.println(res);
    }
    static int linear(int[] arr, int key){
        if(arr.length == 0)
            return -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;  
    }
    */

    //Searching in a 2D Array
    public static void main(String[] args){
        int[][] arr = {
            {24,56,2},
            {34,7,90,25},
            {35,77,12,98},
            {80,50}
        };
        int key = 90;
        System.out.println(Arrays.toString(linear(arr,key)));
    }
    static int[] linear(int[][] arr, int key){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == key){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
