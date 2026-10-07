public class hello {
    // This is a simple java program
    /* This is a multi-line comment */
    public static void main(String[] args) {
        System.out.println("i like a mude");
        System.out.println("it s really good");
        System.out.println("it cost is 20 rupees");
        System.out.println("it is a good product");
        // variable = a reusable container for a value
        // a variable behaves as if it was the value it contains

        // Primitives = simple value that store directly in memory(stack)
        // refrence = memory address that points to a value stored in memory(heap)

        // primitives

        // int (32 bit integer)
        // double (64 bit floating-point number)
        // boolean (true or false)
        // char (16 bit Unicode character)
        // byte (8 bit signed integer)

        // reference

        // String (a sequence of characters)
        // Array (a collection of values of the same type)
        // Class (a blueprint for creating objects)
        // Object (an instance of a class)
        // steps to creating a variable

        // steps to creating a variable
        // 1. declare the variable
        // 2.assign a value to the variable

        int age = 20;
        System.out.println(age);
        int years = 2025;
        System.out.println("years = " + years);

        double price = 20;
        double gps = 20.5;
        double temperature = 20.5;
        System.out.println("price = " + price);
        System.out.println("gps = " + gps);
        System.out.println("temperature = " + temperature);

        char grade = 'A';
        char symbol = '$';
        char currency = '₹';
        System.out.println(grade);
        System.out.println("symbol = " + symbol);
        System.out.println("currency = " + currency);

        boolean isjavaisfum = true;
        boolean isjavaisboring = false;
        System.out.println("isjavaisfum = " + isjavaisfum);
        if (isjavaisboring) {
            System.out.println("isjavaisboring = " + isjavaisboring);
        } else {
            System.out.println("isjavaisboring = " + isjavaisboring);
        }

        // reference

        String name = "Tejas";
        String food = "Mude";
        System.out.println("your favourite food = " + food + " " + name + " and your name = " + name);
        System.out.println("name = " + name);
        System.out.println("gps = " + gps);

        // Arithmetic operators

        int x = 10;
        int y = 5;
        int sum = x + y;
        int difference = x - y;
        int product = x * y;
        int quotient = x / y;
        int remainder = x % y;
        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
        System.out.println("remainder = " + remainder);

        // Augmented assignment operators

        double z = 10;
        double w = 5;
        z += w;
        z -= w;
        z *= w;
        z /= w;
        System.out.println("z = " + z);
        System.out.println("w = " + w);
        System.out.println("z = " + z);
        System.out.println("w = " + w);

        // Increment and decrement operators
        int a = 10;
        int b = 5;

        a++;
        a++;
        a++;
        b--;
        b--;
        b--;
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        // Order of operations [ parentheses, exponents, multiplication and division,
        // addition and subtraction ]

    }

}
