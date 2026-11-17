package task2;

public class Blowfish extends Fish implements AnimalBehavior {
    private int diameter;

    // 1. Default constructor
    public Blowfish() {
        super();
        this.diameter = 10;
    }

    // 2. Constructor with all parameters
    public Blowfish(String name, int age, double weight, String scaleColor, int diameter) {
        super(name, age, weight, scaleColor);
        this.diameter = diameter;
    }

    // 3. Constructor with some parameters
    public Blowfish(String name, int diameter) {
        super(name, "Yellow-Brown");
        this.diameter = diameter;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (Blowfish) is eating small crustaceans.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " (Blowfish) makes silent puffing bubbles.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " (Blowfish) is sleeping near the coral reef.");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swim");
    }

    public void inflate() {
        System.out.println(getName() + " inflated to a diameter of " + diameter + " cm!");
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Blowfish{" + super.toString() + ", Diameter=" + diameter + "cm}";
    }
}
