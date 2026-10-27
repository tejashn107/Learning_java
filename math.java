import java.util.Scanner;

public class math {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;
        double result1;
        double result2;
        double result3;
        double result4;
        double result5;
        double result6;
        double result7;

        result = Math.pow(2, 5);
        result1 = Math.abs(-5);
        result2 = Math.sqrt(6);
        result3 = Math.round(4.44);
        result4 = Math.ceil(3.12);
        result5 = Math.floor(5.66);
        result6 = Math.max(12, 34);
        result7 = Math.min(23, 44);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);

        // hypotenus = Math.sqrt(a*2 + b*2)

        double a;
        double b;
        double c;

        System.out.println("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.println("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenus (side c) is : " + c + "cm");

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

        double radius;
        double circumference;
        double area;

        System.out.println("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);

        System.out.println("Area is : " + area + "cm²");

        System.out.println("Circumference is : " + circumference + "cm");

        scanner.close();
    }

}
