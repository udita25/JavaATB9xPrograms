package Oct.ex14102024;

public class Lab007 {
    public static void main(String[] args){
         //Type Casting
        // Implicit Type Casting - done by compiler
        byte a = 10;
        int b = a;
        System.out.printf("\nByte to Integer (Implicit): %d", b);

        //Explicit Type Casting - done by user itself before compilation of a program.
        byte c = 20;
        int d = (int)c;
        System.out.printf("\nByte to Integer(Explicit): %d", d);

        //Widening - converting small memory data type to a large memory data type
        //No data loss happens either in implicit or explicit type casting
        int x = 80;
        double y = x; //another way - double y = (double) x;
        System.out.printf("\nWidening integer to double datatype: %f",y);

        //Narrowing - converting large memory data type to a small memory data type
        //Data Loss happens
        double i = 10.5;
        int j = (int)i;
        System.out.printf("\nNarrowing double to integer datatype: %d",j);

    }
}
