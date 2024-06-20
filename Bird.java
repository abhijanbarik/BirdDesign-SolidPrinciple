package BirdSystemDesignSolid;

public abstract class Bird {

    private final int weight;

    private final String color;

    private final String name;

    public Bird(int weight, String color, String name) {
        this.weight = weight;
        this.color = color;
        this.name = name;
    }

    public void display(){
        System.out.println(STR."Name of bird -> \{name},  Weight of bird -> \{weight},  Color of bird -> \{color}");
    }

    public void walk(){
        System.out.println(STR."This \{name} can walk.");
    }
}
