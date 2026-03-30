public class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, boolean isIndoor) {
        super(name);
        this.isIndoor = isIndoor;
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }

    @Override
    public String getDetails() {
        return "Cat: " + getName() + (isIndoor ? " (indoor)" : " (outdoor)");
    }

    public void purr() {
        System.out.println(getName() + " purrs...");
    }
}
