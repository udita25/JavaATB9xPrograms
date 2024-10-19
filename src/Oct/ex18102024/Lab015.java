package Oct.ex18102024;

import java.util.Scanner;

public class Lab015 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double result;

        System.out.println("Select an option (1 or 2): ");
        System.out.println("1. Convert kilometre to miles. \n 2. Convert temperature celsius to fahrenheit. \n Enter here: ");
        int choice = sc.nextInt();

        System.out.println("Enter the value: ");
        float value = sc.nextFloat();

        switch(choice){

            case 1:
                result = (value*0.62137);
                System.out.printf("Your answer is: %.3f miles.", result);
                break;

            case 2:
                result = (value-32) * 5/9;
                System.out.printf("Your answer is: %.3f fahrenheit.", result);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }
}
