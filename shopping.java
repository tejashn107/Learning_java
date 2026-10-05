import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {

        // Shopping cart program

        Scanner scanner = new Scanner(System.in);

        String item;
        int quantity;
        double price;
        char currency = '$';
        double total;

        System.out.println("What item would you like to purchase?:");
        item = scanner.nextLine();

        System.out.println("what is the price of the item?");
        price = scanner.nextDouble();

        System.out.println("How many would you like to purchase?");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println(
                "\n you have brought " + quantity + " " + item + "(s) at a price of " + currency + price + " each.");
        System.out.println("Your total is " + currency + total);

        scanner.close();

    }

}
