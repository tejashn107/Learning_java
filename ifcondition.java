import java.util.Scanner;

public class ifcondition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.println("Enter your name:");
        name = scanner.nextLine();

        System.out.println("Enter your age:");
        age = scanner.nextInt();

        System.out.println("Are you a student (yes/no)?");
        String response = scanner.next();
        isStudent = response.equalsIgnoreCase("yes");

        // Name check
        if (name.isEmpty()) {
            System.out.println("You did not enter your name.");
        } else {
            System.out.println("Hello, " + name + "!");
        }

        // Age check
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }

        // Student status check
        if (isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }

        scanner.close();
    }
}