// package Assignment_5;

import java.util.Scanner;

public class Practice_54 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int result = 0;
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            result = i * i * i;
            System.out.print(result + " ");
        }
    }
}
