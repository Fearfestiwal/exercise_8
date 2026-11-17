package task2;

public class Mammal extends Animal {
    private String order;

    // 1. Default constructor
    public Mammal() {
        super();
        this.order = "Unknown";
    }

    // 2. Constructor with all parameters
    public Mammal(String name, int age, double weight, String order) {
        super(name, age, weight);
        this.order = order;
    }

    // 3. Constructor with some parameters
    public Mammal(String name, String order) {
        super(name);
        this.order = order;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (Mammal) is eating mammal food.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " (Mammal) makes a mammal sound.");
    }

    public void drinkMilk() {
        System.out.println(getName() + " is drinking milk.");
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString() + ", Order='" + order + "'}";
    }
}
