package animale;

public class Animal {
    String name;
    String colour;
    boolean isVegetarian;

    public Animal() {
        isVegetarian = true;
        name = "unknown";
        colour = "unknow";
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public Animal(String name, String colour, boolean isVegetarian) {
        this.name = name;
        this.colour = colour;
        this.isVegetarian = isVegetarian;
    }

    public void mananca(){
        System.out.println(this.name+" mananca");
        //System.out.println(name+"mananca");
    }

    public void doarme(){
        System.out.println(this.name+" doarme");
        //System.out.println(name+"doarme");
    }

    public String afiseazaCuloare(){
        return this.name+" are culoarea "+colour;
    }
}

