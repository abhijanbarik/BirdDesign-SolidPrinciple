package BirdSystemDesignSolid;
import java.lang.reflect.Method;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Bird> birds = new ArrayList<>();

        birds.add(new Owl(1, "Brown_Black", "Ullu"));
        birds.add(new Crow(2, "Black", "Kaalu"));
        birds.add(new Pigeon(3, "Gray_Silver", "Kabutar"));
        birds.add(new Sparrow(4, "Brown_White", "Gauraiya", new PigeonOwlFlyingBehaviour()));
        birds.add(new Penguinn(5, "White_Black", "Pengu"));

        // Iterate over the list and print bird details and their behaviors
        for (Bird bird : birds) {
            bird.display();
            bird.walk();
            if (bird instanceof Flyable) { 
                ((Flyable) bird).canFly();
            }
            if (bird instanceof Eatable) {
                ((Eatable) bird).canEat();
            }
            if (bird instanceof FlyingBehaviour) {
                ((FlyingBehaviour) bird).makeFly();
            }
            System.out.println();
        }
    }
}
