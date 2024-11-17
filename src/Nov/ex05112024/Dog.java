package Nov.ex05112024;

class Dog {
    private String name;
    private int age;
    private String breed;
    private String color;
    private double weight;

    // Constructor
    public Dog(String name, int age, String breed, String color, double weight) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.weight = weight;
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

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    // Method to display dog information
    public void displayInfo() {
        System.out.println("\nDog Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " kg");
    }
}
