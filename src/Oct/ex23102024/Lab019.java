package Oct.ex23102024;

import java.util.Scanner;

public class Lab019 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Addition: " + sum(num1,num2));
        System.out.println("Subtraction: " + sub(num1,num2));
        System.out.println("Multiplication: " + mult(num1,num2));
        System.out.println("Division: " + div(num1,num2));

        sc.close();
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sub(int a, int b){
        return a-b;
    }

    static int mult(int a, int b){
        return a*b;
    }

    static float div(int a, int b){
        return (float) a/b;
    }
}
