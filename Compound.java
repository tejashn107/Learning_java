import java.util.Scanner;

public class Compound {
    public static void main(String[] args) {

        // Compound interested calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timeCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble();

        System.out.println("Enter the # of times compounded per year: ");
        timeCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timeCompounded, timeCompounded * years);

        System.out.printf("The amount after %d years is $%.2f", years, amount);

        scanner.close();
    }
}