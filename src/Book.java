public class Book {
    private double pret = 50.0; //nu poate fi modificat din exterior
    public String titlu; //poate fi modificat din exterior
    public String autor; //poate fi modificat din exterior
    public String editura;

    public double getPret(){
        return pret;
    }

    public void setPret(double pretulNou){
        pret = pretulNou;
    }

    public void afiseaza(){
        System.out.println("Cartea "+titlu+" are autorul "+autor+" si pretul "+pret);
    }


}
