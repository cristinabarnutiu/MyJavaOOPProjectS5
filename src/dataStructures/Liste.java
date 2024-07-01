package dataStructures;

import java.util.ArrayList;

public class Liste {
    public static void main(String[] args) {

        ArrayList<String> listaDeStudenti = new ArrayList<>();
        listaDeStudenti.add("Raluca"); // index = 0
        listaDeStudenti.add("David"); // index = 1
        listaDeStudenti.add("Mihail"); //index = 2


        System.out.println(listaDeStudenti.get(2));
        System.out.println(listaDeStudenti.size());

        listaDeStudenti.remove(0);
        System.out.println(listaDeStudenti.get(0));
        System.out.println(listaDeStudenti.size());

        listaDeStudenti.set(1,"Cata");
        System.out.println(listaDeStudenti.contains("Mihail"));

        System.out.println(listaDeStudenti.indexOf("Cata"));

        System.out.println(listaDeStudenti);
        for (String student: listaDeStudenti){
            System.out.println(student+ " a trecut examenul de Testare");
        }


    }




}
