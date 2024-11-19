package Nov.ex18112024;

public class Lab031 {
    public static void main(String[] args) {
        try {
            // Potential NullPointerException if args is empty
            String a1 = args[0];
            System.out.println("Argument received: " + a1);

            String s1 = "Pramod";

            // ArithmeticException due to division by zero
            int a = 10 / 0;

            // Potential NullPointerException
            s1 = null;
            int length = s1.length();
            System.out.println("Length of string: "+ length);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: No command-line argument provided");

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");

        } catch (NullPointerException e) {
            System.out.println("Error: Null reference encountered");

        } catch (Exception e) {
            System.out.println("An unexpected error occurred");

        } finally {
            System.out.println("Exception handling block completed");
        }
    }
}
