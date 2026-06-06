public class TypeCasting {
    public static void main(String[] args){
        //1. --- Type Conversion (Widening / Implicit) ---
        int myInt = 100;
        //Automatically converts int to double
        double myDouble = myInt;
        System.out.println("---Widening (Automatic)---");
        System.out.println("Inserted integer value: "+myInt);
        System.out.println("Inserted double value: "+myDouble);

        //2. --- Type Casting (Narrowing / Explicit) ---
        double originalDouble = 99.99;
        //Manually casting double to int (decimal part is lost)
        int castedInt = (int) originalDouble;
        System.out.println("---Narrowing (Manual)---");
        System.out.println("Original double value: "+originalDouble);
        System.out.println("Casted integer value: "+castedInt);

        // Another example: Large value overflow
        int bigInt = 130;
        //Explicitly casting int to byte (byte range is -128 to 127)
        byte castedByte = (byte) bigInt;
        System.out.println("Big integer value: "+bigInt);
        System.out.println("Casted byte value: "+castedByte);
        // Here 130 is 3 more than 127(larger value of range) so 3 lessthan lower range value is assigned i.e., wraps around
    }
}