package Oct.ex29102024;

import java.util.Scanner;

public class Lab021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1));
            arr[i] = sc.nextInt();
        }

        int min_val = GiveMin(arr);
        int max_val = GiveMax(arr);

        System.out.println("The smallest value in the array is " + min_val);
        System.out.println("The biggest value in the array is " + max_val);

        sc.close();
    }

    static int GiveMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int GiveMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
