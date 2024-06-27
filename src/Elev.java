public class Elev {
    String nume;
    double medieGenerala;
    public static String diriginte = "dirigu";

    public Elev(String nume, double medieGenerala) {
        this.nume = nume;
        this.medieGenerala = medieGenerala;
    }

    public void afisareElev(){
        System.out.println(this.nume+" are media "+this.medieGenerala+" si are diriginte pe "+diriginte);
    }


}
