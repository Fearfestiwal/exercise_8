# Exercise 8 — Packages and Interfaces (Vistula University)

## Structure
- **`src/task1/`**:
  - `Salary.java` — Interface with normal (`salaryToPayAksoy66886`), `default` (`salaryForOvertimeAksoy66886`), and `static` (`shouldReceiveBonusAksoy66886`) methods.
  - `Person.java` — Base class with `initializeAksoy66886()` and `printAksoy66886()`.
  - `Staff.java` — Subclass extending `Person` and implementing `Salary`.
  - `MainTask1.java` — Entry point demonstrating `Staff` and answering the Task 1 interface questions.
- **`src/task2/`**:
  - `AnimalBehavior.java` — Interface with `void sleep()`.
  - `AnimalMove.java` — Interface with `default void move()`.
  - `AnimalName.java` — Interface with `static void name(String name)`.
  - `Animal.java`, `Mammal.java`, `Bird.java`, `Fish.java`, `Dog.java`, `Pigeon.java`, `Blowfish.java` — Multi-level hierarchy implementing `AnimalMove` and `AnimalBehavior`.
  - `Main.java` — Entry point demonstrating `move()`, `AnimalName.name()`, and `AnimalBehavior[]` `sleep()` calls.
