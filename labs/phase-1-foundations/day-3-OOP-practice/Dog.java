public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }

    @Override
    public String getDetails() {
        return "Dog: " + getName() + " (" + breed + ")";
    }

    public void fetch() {
        System.out.println(getName() + " fetches the ball!");
    }
}
