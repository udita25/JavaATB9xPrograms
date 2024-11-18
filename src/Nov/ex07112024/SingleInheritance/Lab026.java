package Nov.ex07112024.SingleInheritance;

public class Lab026 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.type = "Feline";
        cat1.NumOfLegs = "4";
        cat1.name = "Whiskers";
        cat1.breed = "Siamese";
        cat1.color = "Gray";

        cat1.displayInfo1();
        cat1.displayInfo();
        cat1.eat();
        cat1.sleep();
        cat1.makeSound();
    }

}
