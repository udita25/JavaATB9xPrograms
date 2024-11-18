package Nov.ex07112024.HierarchicalInheritance;

public class Lab028 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Labrador", "Golden");
        dog.displayInfo();

        System.out.println();

        Cat cat = new Cat("Whiskers", 2, "Siamese", "Gray");
        cat.displayInfo1();
    }
}
