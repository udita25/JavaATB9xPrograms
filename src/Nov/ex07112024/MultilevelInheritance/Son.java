package Nov.ex07112024.MultilevelInheritance;

public class Son extends Father{
    void SonInformation(){
        String bhk = "5bhk";
        int age = 23;
        System.out.println("Son's Information");
        System.out.println("------------------------");
        System.out.println("Son's BHK: " + bhk);
        System.out.println("Son's Age: " + age);
        System.out.println("------------------------");

    }
}
