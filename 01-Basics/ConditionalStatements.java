public class ConditionalStatements {
    public static void main(String[] args){
        int num=10;
        System.out.println("------if Statement-----");
        if(num>0){
            System.out.println("The number is positive.");
        }

        System.out.println("------if-else-----");
        if(num%2==0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }

        System.out.println("------if-else-if Ladder-----");
        if(num<0){
            System.out.println("The number is negative.");
        }
        else if(num==0){
            System.out.println("The number is zero.");
        }
        else{
            System.out.println("The number is positive.");
        }

        System.out.println("------Switch Statement-----");
        int day=3;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Tuesday");
                break;
            default:
             System.out.println("Other day");
        }
    }
}