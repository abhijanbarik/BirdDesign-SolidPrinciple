package BirdSystemDesignSolid;

public class Owl extends Bird implements Flyable {

    public Owl(int weight, String color, String name) {
        super(weight, color, name);
    }

    @Override
    public void canFly() {
        System.out.println("Owl can fly");
    }
}
