package Oct.ex16102024;

public class Lab010 {
    public static void main(String[] args){

        int num1 = Integer.parseInt(args[0]);  // First number
        int num2 = Integer.parseInt(args[1]);  // Second number

        System.out.println(num1 > num2 ? "First number is bigger." : "Second number is bigger.");
    }
}
