import java.util.Scanner;

public class ifcondition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;

        System.out.println("Enter your name:");
        name = scanner.nextLine();

        System.out.println("Enter your age:");
        age = scanner.nextInt();

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

        scanner.close();
    }
}