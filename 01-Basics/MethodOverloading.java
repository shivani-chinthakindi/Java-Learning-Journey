public class MethodOverloading{

    // 1. Base method: Multiplies two integers

    public int multiply(int a, int b){
        return a * b;
    }

    // 2. Overloaded method: Differs by number of parameters (three integers)

    public int multiply(int a, int b, int c){
        return a * b * c;
    }

    // 3. Overloaded method: Differs by data type of parameters (two doubles)

    public double multiply(double a, double b){
        return a * b;
    }

    // 4. Overloaded method: Differs by sequence of data types (String, then int)

    public void printMessage(String text, int times){
        for(int i = 0; i < times; i++){
            System.out.println(text);
        }
    }

    // 5. Overloaded method: Differs by sequence of data types (int, then String)
 
     public void printMessage(int times, String text){
        System.out.println("Reversed order execution:");
        for(int i = 0; i < times; i++){
            System.out.println(text);
        }
    }

    public static void main(String[] args){
        MethodOverloading demo = new MethodOverloading();

        // Testing overloaded multiply methods
        System.out.println("Two integers (5 * 4): " + demo.multiply(5,4));
        System.out.println("Three integers (1 * 2 * 3): " + demo.multiply(1,2,3));
        System.out.println("Two doubles (2.5 * 4.2): " + demo.multiply(2.5,4.2));

        System.out.println("---------------------------");

        // Testing overloaded print methods (order of parameters)
        demo.printMessage("Hello Java!", 2);
        demo.printMessage(2, "Learning Overloading!");
    }
}