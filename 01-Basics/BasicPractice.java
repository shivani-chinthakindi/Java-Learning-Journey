import java.util.Scanner; // Step 1: Import the Scanner class

public class BasicPractice {
    public static void main(String[] args) {
        // Step 2: Create a Scanner object for console input
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Java Scanner Methods Demo ---");

        // nextLine(): Reads a full line of text (including spaces)
        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        // next(): Reads the next token (stops at whitespace)
        System.out.print("Enter your nickname (one word): ");
        String nickname = scanner.next();

        // nextInt(): Reads an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // nextDouble(): Reads a double-precision floating-point number
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        // nextBoolean(): Reads a boolean value (true/false)
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // nextLong(): Reads a long integer
        System.out.print("Enter your mobile number: ");
        long mobile = scanner.nextLong();

        // nextFloat(): Reads a single-precision floating-point number
        System.out.print("Enter your height (in meters): ");
        float height = scanner.nextFloat();

        // hasNextInt(): Checks if the next token is an integer (validation)
        System.out.print("Enter a number to check if it's an integer: ");
        if (scanner.hasNextInt()) {
            int check = scanner.nextInt();
            System.out.println("Yes, " + check + " is an integer.");
        } else {
            System.out.println("No, that's not an integer.");
            scanner.next(); // Consume invalid input
        }

        // Output results
        System.out.println("\n--- Collected Data ---");
        System.out.println("Name: " + name);
        System.out.println("Nickname: " + nickname);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Student Status: " + isStudent);
        System.out.println("Mobile: " + mobile);
        System.out.println("Height: " + height);

        // Step 3: Always close the scanner to free resources
        scanner.close();
    }
}