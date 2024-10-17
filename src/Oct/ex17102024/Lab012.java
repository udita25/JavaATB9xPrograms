package Oct.ex17102024;

import java.util.Scanner;

public class Lab012 {
    public static void main(String[] args){
        /*Write a program that classifies a triangle based on its side lengths. Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify the triangle */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of side 1 (in cm): ");
        int side1 = sc.nextInt();

        System.out.println("Enter length of side 2 (in cm): ");
        int side2 = sc.nextInt();

        System.out.println("Enter length of side 3 (in cm): ");
        int side3 = sc.nextInt();

        if(side1 == side2 && side2 == side3){
            System.out.println("Equilateral Triangle.");
        }
        else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("Isosceles Triangle.");
        }
        else{
            System.out.println("Scalene Triangle.");
        }

        sc.close();
    }
}
