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

        // flags

        // + = output a plus
        // , = comma groping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price4 = 9.33;
        double price5 = 100.13;
        double price6 = -54.34;

        System.out.printf("( = negative numbers are enclosed in ()");
        System.out.printf("%(.2f\n", price4);
        System.out.printf("%(.2f\n", price5);
        System.out.printf("%(.2f\n", price6);

        System.out.printf(" space = display a minus if negative, space if positive");
        System.out.printf("% .2f\n", price4);
        System.out.printf("% .2f\n", price5);
        System.out.printf("% .2f\n", price6);

        // width

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);

    }

}
