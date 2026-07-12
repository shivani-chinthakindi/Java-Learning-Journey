import java.util.Arrays;

class StringMethods {
    public static void main(String[] args) {
        String name = "Shivani Patel";
        System.out.println(name);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));
        System.out.println("         Shivani     ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.substring(3, 7));

    }
}