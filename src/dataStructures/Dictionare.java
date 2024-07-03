package dataStructures;

import java.util.HashMap;

public class Dictionare {
    public static void main(String[] args) {
        HashMap<Integer,String> dictionar = new HashMap();
        dictionar.put(1,"First");
        dictionar.put(2,"Second");
        dictionar.put(3,"Third");
        dictionar.put(4,"Fourth");
        dictionar.put(7,"Seventh");
        dictionar.remove(3); //sterge perechea cu cheia = 3
        System.out.println(dictionar.get(2));
        System.out.println(dictionar.get(3));
        System.out.println(dictionar.keySet()); //1,2,4,7
        System.out.println(dictionar.values()); //First, Second, Fourth..
        System.out.println(dictionar.entrySet());
        System.out.println(dictionar);
        dictionar.replace(4,"Fourth-updated");
        System.out.println(dictionar.entrySet());

        dictionar.putIfAbsent(7,"Seventh-updated");
        System.out.println(dictionar.entrySet());

        for(int key:dictionar.keySet()){
            System.out.println(key);
        }

        for(String value:dictionar.values()){
            System.out.println(value);
        }

        //Exercitiu clasa:
        //Creati un dictionar nou cu perechi cheie-valoare:
        //Cheie: echipaFotbal (String)
        //Valoare: seCalificaInSferturi (Boolean)

        //adaugati elementele: Franta-da, Romania-nu, Italia-nu, Olanda-da, Portugalia-da

        //afisati toate perechile cheie - valoare

        HashMap<String, Boolean> calificari = new HashMap<>();
        calificari.put("Franta", true);
        calificari.put("Romania", false);
        calificari.put("Italia", false);
        calificari.put("Olanda", true);
        calificari.put("Portugalia", true);

        System.out.println(calificari.entrySet());

        for (String echipa: calificari.keySet()){
            if(calificari.get(echipa)) { //afiseaza doar echipele a caror valoare = true
                System.out.println(echipa);
            }
        }

//        for (boolean v: calificari.values()){
//            System.out.println(v);
//        }





    }

}
