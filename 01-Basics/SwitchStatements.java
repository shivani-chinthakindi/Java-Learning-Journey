import java.util.Scanner;
class SwitchStatements{
    public static void main(String[] args){
        
        // Basic switch statement implementation

        char gen = 'F';
        switch(gen){
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("Other");
                break;
        }
        System.out.println("----------------------------");

        // Missing the break statements in between the cases

        int day = 4;
        switch(day){
            case 1:
            case 2:
            case 3:
                System.out.println("Weekday");
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }
        System.out.println("----------------------------");


        // Another syntax of switch statement

        int num = 5;
        switch(num){
            case 1,3,5->System.out.println("Odd");
            case 2,4->System.out.println("Even");
        }
        System.out.println("----------------------------");


        // Nested switch 

        System.out.println("Enter your empID and department:");
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String dep = in.next();
        switch(empID){
            case 1:
                System.out.println("Seetha");
                break;
            case 2:
                System.out.println("Geetha");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch(dep){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "CSE":
                        System.out.println("CSE");
                        break;
                    default:
                        System.out.println("No dep entered");
                        break;
                }
                default:
                    System.out.println("Enter correct empID");
        }
        in.close();
    }
}