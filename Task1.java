package Intenshipproject;

import java.util.Scanner;

public class Task1 {
    // Design a Basic Calculator Using Java.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first_number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second_number: ");
        int b = sc.nextInt();
        System.out.println("Select an operation to implement:");
        System.out.println("1. Add");

        System.out.println("2. Subtract");

        System.out.println("3. Multiply");

        System.out.println("4. Divide");
        int select = sc.nextInt();
        int ans;

        switch (select) {
            case 1:
                ans  = a + b;
                break;
            case 2:
                ans = a - b;
                break;
            case 3:
                ans  = a *b;
                break;
            case 4:
                ans = a/b;
                break;
            default:
                System.out.println("Invalid ");
                return;
        }
        

        System.out.println("The result is: " + ans);
    }
}
