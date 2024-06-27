public class Fotbalist extends Sportiv{
    String nume;

    public Fotbalist(String nume) {
        this.nume = nume;
    }

    @Override
    public void seAntreneaza() {
        System.out.println("Fotbalistul trage la poarta");
    }

    //suprascriem metoda din clasa parinte
    public void seRecupereaza(){
        System.out.println("Fotbalistul se recupereaza");
    }
}
