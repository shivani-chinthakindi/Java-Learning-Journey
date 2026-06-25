public class ArrayPractice{
    public static void main(String[] args) {
        //evenDigits function calling
        int[] arr = {12,345,2,6,7896};
        int ans = evenDigits(arr);
        System.out.println(ans);

        //maxWealth function calling
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maxWealth(accounts));
    }

    //finding number of elements with even no. of digits
    static int evenDigits(int[] arr){
        int count = 0;
        for(int num: arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits%2 == 0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }

    //finding maximum wealth among various accounts
    static int maxWealth(int[][] accounts){
        int res = Integer.MIN_VALUE;
        for(int[] ints: accounts){
            int sum = 0;
            for(int anInt:ints){
                sum+=anInt;
            }
            if(sum>res){
                res = sum;
            }
        }
        return res;
    }
}