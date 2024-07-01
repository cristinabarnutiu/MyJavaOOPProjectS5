package animale;

public class Cat extends Mamifer{
    public Cat(String name, String colour, boolean isVegetarian, String tipMamifer) {
        super(name, colour, isVegetarian, tipMamifer);
    }

    @Override
    public void scoateSunete(){
        System.out.println(this.name+" miauna");
    }
}
