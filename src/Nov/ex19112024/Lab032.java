package Nov.ex19112024;

public class Lab032 {
    public static void main(String[] args) {
        Sum(12, 45);
        Sum(12.3, 45.6);
        Sum("Udita", "Sharma");

    }

    public static <T> void Sum(T a, T b) {
        System.out.println(a + " " + b);
    }
}



