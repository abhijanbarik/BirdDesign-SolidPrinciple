package BirdSystemDesignSolid;

public class Pigeon extends Bird implements Eatable, Flyable {

    public Pigeon(int weight, String color, String name) {
        super(weight, color, name);
    }

    @Override
    public void canEat() {
        System.out.println("Pigeon can eat.");
    }

    @Override
    public void canFly() {
        System.out.println("Pigeon can fly.");
    }
}
