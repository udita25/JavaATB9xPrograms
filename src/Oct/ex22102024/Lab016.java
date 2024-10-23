package Oct.ex22102024;

import java.util.Scanner;

public class Lab016 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        //Reverse the number using for loop. (In - 12345, Out - 54321)

        int rev = 0;

        for (int i=num; i>0; i=i/10){
            int rem = i%10;
            rev = rev*10 + rem;
        }
        System.out.println("The reverse of the number is: " + rev);

        sc.close();


    }
}
