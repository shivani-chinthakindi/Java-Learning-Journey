class ArrayDeclaration {
    public static void main (String[] args){

        // Method 1: Declare and allocate memory with a fixed size

        int[] arr1 = new int[5];

        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;

        for (int i = 0; i <= arr1.length-1; i++) {
        System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // Method 2: Declare and initialize directly using an Array Literal

        String[] arr2 = {"apple", "banana", "cherry", "mango", "grapes"};

        for (int i = 0; i <= arr2.length-1; i++) {
        System.out.print(arr2[i] + " ");
        }
            
        System.out.println();

    }
}
