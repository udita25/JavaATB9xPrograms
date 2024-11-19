package Nov.ex12112024.Interfaces;

public class Lab030 {

        public static void main(String args[]){
            Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()
            d.draw();



        }}

interface Drawable{
    void draw();
}
//Implementation: by second user
class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}

}
class Circle implements Drawable{
    public void draw(){System.out.println("drawing circle");}
}

