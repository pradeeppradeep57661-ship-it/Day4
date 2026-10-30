
import java.util.Scanner;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator obj = new Calculator();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition = " + obj.add(a, b));
        System.out.println("Subtraction = " + obj.subtract(a, b));
        System.out.println("Multiplication = " + obj.multiply(a, b));

        if (b != 0) {
            System.out.println("Division = " + obj.divide(a, b));
        } else {
            System.out.println("Cannot divide by zero");
        }

        sc.close();
    }
}
