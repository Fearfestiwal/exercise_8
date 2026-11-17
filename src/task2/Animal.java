package task2;

public abstract class Animal implements AnimalMove {
    private String name;
    private int age;
    private double weight;

    // 1. Default constructor
    public Animal() {
        this.name = "Unknown";
        this.age = 0;
        this.weight = 0.0;
    }

    // 2. Constructor with all parameters
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // 3. Constructor with some parameters
    public Animal(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 1.0;
    }

    public abstract void eat();
    public abstract void getVoice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name='" + name + "', Age=" + age + ", Weight=" + weight;
    }
}
