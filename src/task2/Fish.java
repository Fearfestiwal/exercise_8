package task2;

public class Fish extends Animal {
    private String scaleColor;

    // 1. Default constructor
    public Fish() {
        super();
        this.scaleColor = "Silver";
    }

    // 2. Constructor with all parameters
    public Fish(String name, int age, double weight, String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }

    // 3. Constructor with some parameters
    public Fish(String name, String scaleColor) {
        super(name);
        this.scaleColor = scaleColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (Fish) is eating algae and plankton.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " (Fish) says: Blub... blub...");
    }

    public void swim() {
        System.out.println(getName() + " is swimming underwater.");
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    @Override
    public String toString() {
        return "Fish{" + super.toString() + ", ScaleColor='" + scaleColor + "'}";
    }
}
