import java.util.Random;

public class random {
    public static void main(String[] args) {

        Random random = new Random();

        int number;
        double num;
        boolean isStudent;

        isStudent = random.nextBoolean();
        num = random.nextDouble(1, 11);
        number = random.nextInt();

        System.out.println(number);
        System.out.println(num);
        if (isStudent) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }
    }
}