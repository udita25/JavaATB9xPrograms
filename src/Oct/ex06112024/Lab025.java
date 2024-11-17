package Oct.ex06112024;

public class Lab025 {
    public static void main(String[] args) {
        Dog d = new Dog("Labrador");
        d.makeSound();
        System.out.println(d.species);
        
    }

}

class Animal {
    protected String species;

    public Animal(String species) {
        this.species = species;
    }

    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String breed) {
        // Call parent constructor
        super("Canine");
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        // Call parent method
        super.makeSound();
        System.out.println("Woof!");
    }
}
