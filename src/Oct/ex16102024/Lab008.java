package Oct.ex16102024;

import java.util.Scanner;

public class Lab008 {
    public static void main(String[] args){
/*Practice - using console
        int age=Integer.parseInt(args[0]);

        System.out.println(age>18?"Eligible to vote.": "Not eligible to vote.");
 */

     //Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        System.out.println(age>18?"Eligible to vote.": "Not eligible to vote.");

        sc.close();

 }
}
