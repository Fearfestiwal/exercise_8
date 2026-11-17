package task2;

public interface AnimalMove {
    // Default method printing general info with the name of the class it was called on
    default void move() {
        System.out.println(this.getClass().getSimpleName() + " moves in a general way.");
    }
}
