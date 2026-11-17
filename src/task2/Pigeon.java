package task2;

public class Pigeon extends Bird implements AnimalBehavior {
    private String species;

    // 1. Default constructor
    public Pigeon() {
        super();
        this.species = "Rock Pigeon";
    }

    // 2. Constructor with all parameters
    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    // 3. Constructor with some parameters
    public Pigeon(String name, String species) {
        super(name, "Grey");
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (Pigeon) is eating breadcrumbs.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " (Pigeon) says: Coo! Coo!");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " (Pigeon) is sleeping on a tree branch.");
    }

    @Override
    public void move() {
        System.out.println("Pigeon fly");
    }

    public void deliverMessage() {
        System.out.println(getName() + " is delivering a message.");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pigeon{" + super.toString() + ", Species='" + species + "'}";
    }
}
