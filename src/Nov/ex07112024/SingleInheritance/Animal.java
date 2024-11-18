package Nov.ex07112024.SingleInheritance;

public class Animal {
    String type;
    String NumOfLegs;

    void eat() {
        System.out.println("Animal is eating.");
    }
    void sleep() {
        System.out.println("Animal is sleeping.");
    }
    void displayInfo1() {
        System.out.println("Animal Type: " + type);
        System.out.println("Number of Legs: " + NumOfLegs);
    }
}
