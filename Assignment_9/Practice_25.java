package Assignment_9;
// 25.Write a Java program to check if an array of integers is without 0 and -1.

import java.util.Scanner;

public class Practice_25 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size");
        int size =sc.nextInt();
        int arr[] =new int[size];
        System.out.println("Enter number");
        for(int i =0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i] == 0 && arr[i] == -1){
                System.out.println("Array without 0 and -1");

            }
            else{
                System.out.println("Array of integers : "+ arr[i]);
            }
        }
        
    }
}
