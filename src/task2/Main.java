package task2;

public class Main {
    public static void main(String[] args) {
        // 1. Array of Animal references from previous lab
        Animal[] animals = new Animal[6];
        animals[0] = new Mammal("Leo", 5, 190.5, "Carnivora");
        animals[1] = new Dog("Buddy", "Golden Retriever");
        animals[2] = new Bird("Tweety", "Yellow");
        animals[3] = new Pigeon("Sky", 2, 0.4, "Grey", "Homing Pigeon");
        animals[4] = new Fish("Nemo", "Orange");
        animals[5] = new Blowfish("Puffy", 3, 1.2, "Spotted", 25);

        System.out.println("=== 1. AnimalMove: foreach loop calling move() on each Animal ===");
        for (Animal animal : animals) {
            animal.move();
        }

        System.out.println("\n=== 2. AnimalName: foreach loop calling static AnimalName.name(animal.getName()) ===");
        for (Animal animal : animals) {
            AnimalName.name(animal.getName());
        }

        System.out.println("\n=== 3. AnimalBehavior: array of AnimalBehavior references calling sleep() on individual indexes ===");
        AnimalBehavior[] behaviors = new AnimalBehavior[3];
        behaviors[0] = new Dog("Buddy", 4, 28.5, "Carnivora", "Golden Retriever");
        behaviors[1] = new Pigeon("Sky", 2, 0.4, "Grey", "Homing Pigeon");
        behaviors[2] = new Blowfish("Puffy", 3, 1.2, "Spotted", 25);

        behaviors[0].sleep();
        behaviors[1].sleep();
        behaviors[2].sleep();
    }
}
