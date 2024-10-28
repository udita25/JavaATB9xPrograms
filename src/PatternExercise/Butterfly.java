package PatternExercise;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int num = sc.nextInt();
        //upper half
        for(int i = 1; i <= num; i++){
            //first half
            for(int j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            //spaces
            for(int j = 1; j <= 2*(num-i); j++){
                System.out.print("  ");
            }
            //second half
            for(int j = 1; j <=i; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

        //lower half
        for(int i = num; i >= 1; i--){
            //first half
            for(int j = 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            //spaces
            for(int j = 1; j <= 2*(num-i); j++){
                System.out.print("  ");
            }
            //second half
            for(int j = 1; j <=i; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
