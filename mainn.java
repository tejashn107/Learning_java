public class mainn {
    public static void main(String[] args) {

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        String name = "spongbob";
        char firstletter = 's';
        int age = 30;
        double height = 60.0;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name Starts with a %c\n", firstletter);
        System.out.printf("your age is %d years", age);
        System.out.printf("you are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old", name, age);

        // precision

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -56.01;

        System.out.printf("%f\n", price1);
        System.out.printf("%.1f\n", price2);
        System.out.printf("%.8f\n", price3);

    }

}
