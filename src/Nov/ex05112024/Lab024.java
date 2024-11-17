package Nov.ex05112024;

public class Lab024 {
    public static void main(String[] args){
        Dog dog1 = new Dog("Max", 3, "Labrador", "Golden", 30.5);
        Dog dog2 = new Dog("Luna", 2, "Husky", "White", 25.0);
        Dog dog3 = new Dog("Rocky", 4, "German Shepherd", "Black and Tan", 32.0);
        Dog dog4 = new Dog("Rex", 6, "Husky", "White",28.0);
        Dog dog5 = new Dog("Zeus", 4, "Belgian Malinois", "Brown", 34.0);

        // Displaying information for all dogs
        dog1.displayInfo();
        dog2.displayInfo();
        dog3.displayInfo();
        dog4.displayInfo();
        dog5.displayInfo();

    }
}
