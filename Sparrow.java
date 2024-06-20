package BirdSystemDesignSolid;

public class Sparrow extends Bird implements Flyable, FlyingBehaviour{
    private final FlyingBehaviour fb;
    public Sparrow(int weight, String color, String name, FlyingBehaviour fb) {
        super(weight, color, name);
        this.fb = fb;
    }

    @Override
    public void canFly() {
        System.out.println("Sparrow can fly.");
    }

    @Override
    public void makeFly() {
        fb.makeFly();
    }
}
