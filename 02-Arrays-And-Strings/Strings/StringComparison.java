class StringComparison{
    public static void main(String[] args) {
        String a = "Shivani";
        String b = "Shivani";
        System.out.println(a == b); // checks both the value and to which it is pointed
        String name1 = new String("Shivani");
        String name2 = new String("Shivani");
        System.out.println(name1 == name2);
        //System.out.println(name1.equals(name2)); // checks only value
    }
}