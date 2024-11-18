package Nov.ex07112024.MultilevelInheritance;

public class Father extends GrandFather{
    void FatherInformation(){
        String bhk = "3bhk";
        int age = 48;
        System.out.println("Father's Information");
        System.out.println("------------------------");
        System.out.println("Father's BHK: " + bhk);
        System.out.println("Father's Age: " + age);
        System.out.println("------------------------");

    }
}
