package Oct.ex29102024;

import java.util.Scanner;

public class Lab022 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1));
            arr[i] = sc.nextInt();
        }

        int duplicate_val = DuplicateElement(arr);

        System.out.println("The duplicate element is "+ duplicate_val);
        sc.close();
    }

    static int DuplicateElement(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return 0;
    }

}
