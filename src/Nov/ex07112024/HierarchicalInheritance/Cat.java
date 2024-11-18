package Nov.ex07112024.HierarchicalInheritance;

public class Cat extends Animal{
    private String breed;
    private String color;
    private String name;
    private int age;

    public Cat(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }


    // Method to display dog information
    public void displayInfo1() {
        System.out.println("\nCat Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
        sleep();
        eat();
    }
}
