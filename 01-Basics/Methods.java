import java.util.Scanner;
public class Methods{
    public static void main(String[] args){

    Greetings.greeting();
    System.out.println("--------------------");
    int ans = Addition.sum();
    System.out.println(ans);
    System.out.println("--------------------");
    String message = StringExample.greet();
    System.out.println(message);
    System.out.println("--------------------");
    int value = Product.productOf(3,5);
    System.out.println(value);
    System.out.println("--------------------");
    String personalized = StringEx.myGreet("Shivani");
    System.out.println(personalized);
    System.out.println("--------------------");
    String name = "Shivani Patel";
    PassingEx.greet(name);
  }
}
// Basic method example

class Greetings{
    static void greeting(){
        System.out.println("Hello World");
    }
}

// Using return

class Addition{
    static int sum(){
        System.out.println("Enter the numbers to be added:");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int sum = n1 + n2;
        in.close();
        return sum;
    }
}

// Testing return

class StringExample{
    static String greet(){
        String greeting = "How are you?";
        return greeting;
    }
}

// Method with arguments

class Product{
    static int productOf(int a, int b){
        int product = a * b;
        return product;
    }
}

// Another implementation of method

class StringEx{
    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }
}

// Method with argument variation

class PassingEx{
    static void greet(String naam){
        System.out.println(naam);
    }
}