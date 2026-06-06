public class Operators {
    public static void main(String[] args){
    int a = 30, b = 20;
    boolean x = true, y = false;

    // 1. Arithmetic Operators
    System.out.println("a + b ="+ (a+b)); // + operator
    System.out.println("a - b ="+ (a-b)); // - operator
    System.out.println("a * b ="+ (a*b)); // * operator
    System.out.println("a / b ="+ (a/b)); // / operator
    System.out.println("a % b ="+ (a%b)); // % operator
    System.out.println(" ");

    // 2. Relational Operators
    System.out.println("a == b ="+ (a==b)); // == operator
    System.out.println("a != b ="+ (a!=b)); // != operator
    System.out.println("a > b ="+ (a>b)); // > operator
    System.out.println("a < b ="+ (a<b)); // < operator
    System.out.println("a >= b ="+ (a>=b)); // >= operator
    System.out.println("a <= b ="+ (a<=b)); // <= operator
    System.out.println(" ");

    // 3. Logical Operators
    System.out.println("((a > b) && (a != 0)) ="+((a>b) && (a!=0))); // && operator
    System.out.println("((a <= b) || (b == 0)) ="+((a<=b) || (b==0))); // || operator
    System.out.println("!(y) ="+ !(y));
    System.out.println(" ");

    // 4. Assignment Operators
    System.out.println("(a = b) ="+(a=b));// = operator
    System.out.println("(a += b) ="+(a+=b));// += operator
    System.out.println("(a -= b) ="+(a-=b));// -= operator
    System.out.println("(a *= b) ="+(a*=b));// *= operator
    System.out.println("(a /= b) ="+(a/=b));// /= operator
    System.out.println("(a %= b) ="+(a%=b));// %= operator
    System.out.println(" ");

    // 5. Unary Operators
    int d = 40;
    System.out.println("(+d) ="+(+d));// + operator
    System.out.println("(-d) ="+(-d));// - operator
    System.out.println("(++d) ="+(++d));// ++ operator
    System.out.println("(--d) ="+(--d));// -- operator
    System.out.println("(!x) ="+(!x));// ! operator
    System.out.println(" ");

    // 6. Ternary Operator
    int i = 30, j = 20;
    String res = (i > j) ? "i is larger" : "j is larger";
    System.out.println("Ternary result: "+res);
    System.out.println(" ");

    // 7. Bitwise Operators
    a = 5;
    b = 3;
    System.out.println("(a & b) = "+ (a & b));// & operator
    System.out.println("(a | b) = "+ (a | b));// | operator
    System.out.println("(a ^ b) = "+ (a ^ b));// ^ operator
    System.out.println("(~a) = "+ (~a));// ~ operator
    System.out.println("(a<<2) = "+ (a<<2));//<< operator
    System.out.println("(a>>2) = "+ (a>>2));// >> operator
    System.out.println("(a>>>2) = "+ (a>>>2));// >>> operator
  }
}