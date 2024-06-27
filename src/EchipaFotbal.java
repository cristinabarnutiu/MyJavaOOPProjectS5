public class EchipaFotbal {
    String nume;
    int punctaj;
    static String campionat;

    public EchipaFotbal(String nume, int punctaj) {
        this.nume = nume;
        this.punctaj = punctaj;
    }

    public void afiseaza(){
        System.out.println(this.nume+" are numar puncte "+this.punctaj+" joaca la "+campionat);
    }
    //1. creati constructor cu 2 param
    //2. creati metoda care afiseaza nume, punctajul si campionatul
    //3. creati doua obiecte cu care sa apelati metoda de la punctul 2

    public static void metodaStatica(){
        System.out.println("Metoda statica");
    }
}
