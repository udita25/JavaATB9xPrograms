package Oct.ex18102024;

import java.util.Scanner;

public class Lab013 {
    public static void main(String[] args){

        float c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Select one option from the menu(1 to 6): ");
        System.out.print("1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Modulus \n Enter here: ");
        int choice = sc.nextInt();

        switch(choice){

            case 1:
                c = num1 + num2;
                System.out.printf("Änswer: %.2f",c);
                break;

            case 2:
                c = num1 - num2;
                System.out.printf("Änswer: %.2f",c);
                break;

            case 3:
                c = num1 * num2;
                System.out.printf("Änswer: %.2f",c);
                break;

            case 4:
                c = (float) num1 / num2;
                System.out.printf("Änswer: %.2f",c);
                break;

            case 5:
                c = num1 % num2;
                System.out.printf("Änswer: %.2f",c);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}
