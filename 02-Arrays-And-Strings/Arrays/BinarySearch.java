public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int key = 45;
        int ans = search(arr,key);
        System.out.println(ans);
    }
    static int search(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(key < arr[mid]){
                end = mid - 1;
            } else if(key > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
