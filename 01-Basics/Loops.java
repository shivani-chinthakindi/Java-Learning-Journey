public class Loops {
    public static void main(String[] args){
        System.out.println("----for loop----");
        for(int i = 0; i <= 5; i++){
            System.out.println("i = "+i);
        }

        System.out.println("----while loop----");
        int j = 1;
        while(j <= 5){
            System.out.println("j = "+j);
            j++;
        }

        System.out.println("----do-while loop----");
        int k = 1;
        do{
            System.out.println("k = "+k);
            k++;
        }while(k <= 5);

        System.out.println("----enhanced for loop----");
        int[] numbers = {10, 20, 30, 40, 50};
        for(int num:numbers){
            System.out.println("num = "+num);
        }
    }
}
