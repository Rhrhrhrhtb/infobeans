
import java.util.Scanner;

public class Que_33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);

        // Swap the values without a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);

    }
}
