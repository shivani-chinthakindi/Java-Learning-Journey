public class FindMinimumElement {
    public static void main (String[] args) {
        int[] arr = {22,58,29,19,39,44};
        System.out.println(findMin(arr));
    }

    static int findMin (int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
