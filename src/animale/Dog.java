package animale;

public class Dog extends Mamifer{
    public Dog(String name, String colour, boolean isVegetarian, String tipMamifer) {
        super(name, colour, isVegetarian, tipMamifer);
    }

    @Override
    public void scoateSunete(){
        System.out.println(this.name+" latra");
    }
}
