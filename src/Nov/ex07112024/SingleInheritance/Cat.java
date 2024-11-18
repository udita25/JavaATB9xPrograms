package Nov.ex07112024.SingleInheritance;

public class Cat extends Animal{

    String name;
    String breed;
    String color;

    void displayInfo() {
        System.out.println("Cat Name: " + name);
        System.out.println("Cat Breed: " + breed);
        System.out.println("Cat Color: " + color);
    }
    void makeSound() {
        System.out.println("Cat is meowing.");
    }

}
