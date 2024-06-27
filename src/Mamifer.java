public class Mamifer extends Animal{
    String tipMamifer;

    public Mamifer(String name, String colour, boolean isVegetarian, String tipMamifer) {
        super(name, colour, isVegetarian);
        this.tipMamifer = tipMamifer;
    }

    public void scoateSunete(){
        System.out.println(name+" scoate sunete");
    }


}
