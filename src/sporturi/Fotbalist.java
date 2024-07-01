package sporturi;

public class Fotbalist extends Sportiv {
    String nume;
    Abilitate abilitate;

    public Fotbalist(String nume) {
        this.nume = nume;
    }

    public Fotbalist(String nume, Abilitate abilitate) {
        this.nume = nume;
        this.abilitate = abilitate;
    }

    @Override
    public void seAntreneaza() {
        System.out.println("Fotbalistul trage la poarta");
    }

    //suprascriem metoda din clasa parinte
    @Override
    public void seRecupereaza(){
        System.out.println("Fotbalistul se recupereaza");
    }

    public void afiseazaDinSuperclasa(){
        super.seRecupereaza();
    }
}
