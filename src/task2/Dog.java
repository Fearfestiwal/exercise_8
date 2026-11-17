package task2;

public class Dog extends Mammal implements AnimalBehavior {
    private String breed;

    // 1. Default constructor
    public Dog() {
        super();
        this.breed = "Mixed";
    }

    // 2. Constructor with all parameters
    public Dog(String name, int age, double weight, String order, String breed) {
        super(name, age, weight, order);
        this.breed = breed;
    }

    // 3. Constructor with some parameters
    public Dog(String name, String breed) {
        super(name, "Carnivora");
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (Dog) is eating dog kibble and bones.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " (Dog) says: Woof! Woof!");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " (Dog) is sleeping in the kennel: Zzz...");
    }

    @Override
    public void move() {
        System.out.println("Dog run");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching the ball.");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + ", Breed='" + breed + "'}";
    }
}
