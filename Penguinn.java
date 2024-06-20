package BirdSystemDesignSolid;

public class Penguinn extends Bird implements Eatable {
    public Penguinn(int weight, String color, String name) {
        super(weight, color, name);
    }

    @Override
    public void canEat() {
        System.out.println("Penguinn can eat.");
    }
}
