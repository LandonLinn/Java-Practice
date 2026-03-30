public class Main {
    public static void main(String[] args) {

        // --- EXPERIMENT 1: Dog declared as Dog ---
        System.out.println("=== Declared as Dog ===");
        Dog specificDog = new Dog("Rex", "Labrador");
        System.out.println(specificDog.getDetails());
        System.out.println(specificDog.makeSound());
        specificDog.fetch(); // ✅ works — declared as Dog

        System.out.println();

        // --- EXPERIMENT 2: Dog declared as Animal ---
        System.out.println("=== Declared as Animal ===");
        Animal genericDog = new Dog("Buddy", "Poodle");
        System.out.println(genericDog.getDetails()); // runs Dog's version
        System.out.println(genericDog.makeSound()); // runs Dog's version
        /* genericDog.fetch(); method does not exist for Animal */

        System.out.println();

        // // --- EXPERIMENT 3: Polymorphism in action ---
        System.out.println("=== Polymorphism — same loop, different behavior ===");
        Animal[] shelter = {
                new Dog("Rex", "Labrador"),
                new Cat("Whiskers", true),
                new Dog("Buddy", "Poodle"),
                new Cat("Shadow", false)
        };

        for (Animal a : shelter) {
            System.out.println(a.getDetails() + " says: " + a.makeSound());
        }

        System.out.println();

        // --- EXPERIMENT 4: Casting back to specific type ---
        System.out.println("=== Casting Animal back to Dog ===");
        Animal mystery = new Dog("Max", "Husky");
        if (mystery instanceof Dog) {
            Dog revealed = (Dog) mystery; // cast back to Dog
            revealed.fetch(); // now you can call Dog methods
        }
    }
}
