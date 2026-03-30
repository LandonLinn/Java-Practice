public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String makeSound() {
        return "...";
    }

    public String getDetails() {
        return "Animal: " + name;
    }

}