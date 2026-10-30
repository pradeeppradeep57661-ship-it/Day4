
import java.util.Scanner;

public class Checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        while (n != 0) {
            if (n > 0) {
                System.out.println("Positive number");
            } else {
                System.out.println("Negative number");
            }
            break;
        }

        if (n == 0) {
            System.out.println("Zero");
        }
    }
}
