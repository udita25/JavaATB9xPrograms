package Oct.ex17102024;

import java.util.Scanner;

public class Lab011 {
    public static void main(String[] args){
        /* Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:

A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = sc.nextInt();

        char grade;

        if(90 <= score && score <= 100 ){
            grade = 'A';
        }
        else if (80 <= score && score <= 89) {
            grade = 'B';
        }
        else if (70 <= score && score <= 89) {
            grade = 'C';
        }
        else if(60 <= score && score <= 69){
            grade = 'D';
        }
        else{
            grade = 'F';
        }

        System.out.printf("Your grade is %s", grade);

        sc.close();

    }
}
