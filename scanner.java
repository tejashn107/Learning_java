import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.next();
        scanner.nextLine(); // Consume the newline character left by next()
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()
        System.out.println("Enter your cgpa:");
        double cgpa = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character left by nextDouble()
        System.out.println("Enter you are a student or not (true/false):");
        boolean isStudent = scanner.nextBoolean();

        // calculate area of a rectangle

        double length = 0;
        double width = 0;
        double area = 0;

        System.out.println("Enter the length of a rectangle:");
        length = scanner.nextDouble();
        System.out.println("Enter the width of a rectangle ");
        width = scanner.nextDouble();

        area = length * width;
        System.out.println("The area of the rectangle is: " + area);

        System.out.println("Hello, " + name + "!");
        System.out.println("your age is " + age);
        System.out.println("your cgpa is " + cgpa + " you are good!");
        System.out.println("Are you a student? " + isStudent);
        scanner.close();
    }
}