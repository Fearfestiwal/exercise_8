package task2;

public class Bird extends Animal {
    private String featherColor;

    // 1. Default constructor
    public Bird() {
        super();
        this.featherColor = "Unknown";
    }

    // 2. Constructor with all parameters
    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    // 3. Constructor with some parameters
    public Bird(String name, String featherColor) {
        super(name);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (Bird) is pecking at seeds.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " (Bird) says: Tweet! Tweet!");
    }

    public void fly() {
        System.out.println(getName() + " is flying in the sky.");
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String toString() {
        return "Bird{" + super.toString() + ", FeatherColor='" + featherColor + "'}";
    }
}
