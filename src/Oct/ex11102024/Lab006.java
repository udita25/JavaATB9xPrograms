package Oct.ex11102024;

public class Lab006 {
    public static void main(String[] args){
       //assignment operator
        int a=20;
        int b=10;

        //Arithmetic Operators
        System.out.printf("Addition: %d",a+b);
        System.out.printf("\nSubtraction: %d", a-b);
        System.out.printf("\nMultiplication: %d", a*b);
        System.out.printf("\nDivision: %d", a/b);
        System.out.printf("\nModulo: %d\n", a%b);

        //Relational Operators
        boolean c= (a>b);
        boolean d= (a<b);
        boolean e= (a<=b);
        boolean f= (a>=b);
        boolean g= (a==b);
        boolean h= (a!=b);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        //Unary Operators
        int i = 10; int j = 10;
        System.out.println(i++);    //Postincrement
        System.out.println(++i);    //Preincrement
        System.out.println(j--);    //PostDecrement
        System.out.println(--j);    //PreDecrement

        //Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println(x && y); //AND
        System.out.println(x || y); //OR
        System.out.println(!y); //NOT

        // new operators
        String my_name = new String("Udita");
        System.out.println(my_name);

    }
}
