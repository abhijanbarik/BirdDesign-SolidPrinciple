package BirdSystemDesignSolid;

public class Crow extends Bird implements Eatable, Flyable, FlyingBehaviour{
    public Crow(int weight, String color, String name) {
        super(weight, color, name);
    }

    @Override
    public void canEat() {
        System.out.println("Crow can eat.");
    }

    @Override
    public void canFly() {
        System.out.println("Crow can fly.");
    }

    FlyingBehaviour fb = new CrowSparrowFlyingBehaviour();
    @Override
    public void makeFly() {
        fb.makeFly();
    }
}
