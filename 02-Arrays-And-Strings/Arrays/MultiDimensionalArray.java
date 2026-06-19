import java.util.*;
public class MultiDimensionalArray {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = in.nextInt();
        System.out.println("Enter number of columns: ");
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Elements of array are: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}