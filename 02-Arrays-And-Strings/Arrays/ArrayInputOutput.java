class ArrayInputOutput {
    public static void main (String[] args) {

        int[] nums = new int[5];

        nums[0] = 11;
        nums[1] = 22;
        nums[2] = 33;
        nums[3] = 44;
        nums[4] = 55;
        
        for (int num: nums) {
            System.out.print(num + " ");
        }
    }
}