public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        ClassDemo obiect1 = new ClassDemo();
        obiect1.attribute2 = "ceva";
        obiect1.getAttribute1();

        Human cristina = new Human();
        Human nicu = new Human();
        cristina.email = "cristina@test.com";
        nicu.email = "nicu@test.com";
        System.out.println(cristina.email);
        System.out.println(nicu.email);

        //class Book
        Book book1 = new Book();
        book1.autor = "Mihai Eminescu";
        book1.titlu = "Poezii";

        System.out.println(book1.autor);
        System.out.println(book1.getPret());
        book1.afiseaza();

        book1.titlu = "Basme"; //suprascriem titlul pt book1
        book1.afiseaza();

        //Exercitiu clasa
        /*creati un obiect nou book2
        pret = 35.00;
        titlu "Amintiri din copilarie"
        autor "Ion Creanga"

        apelati cele doua metode cu obiectul nou creat
         */
        Book book2 = new Book();
        book2.autor = "Ion Creanga";
        book2.titlu = "Amintiri din Copilarile";
        book2.setPret(35.0);
        book2.afiseaza();

        //Exemple clasa Car
        Car myCar = new Car();
        myCar.marca = "Opel";
        myCar.model = "Corsa";
        myCar.anFabricatie = 2013;
        myCar.putere = 119;
        myCar.afiseaza();

        /* Exercitiu:
        adaugati un camp nou culoare
        scrieti o metoda care afiseaza "Masina mea are culoarea [x]
        si apelati metoda in clasa Main"
        */

        Car myOldCar = new Car();
        myOldCar.afiseaza();
        System.out.println(myOldCar.categorie);
        System.out.println(myCar.categorie);

        Car catasCar = new Car("VW","Passat");
        catasCar.afiseaza();

        //Exemplu clasa Person
        Person bula = new Person(2006);
        System.out.println(bula.returnAge());

        Person alinuta = new Person('f',"Alinuta","Bulinuta");
        System.out.println(alinuta.fname+" "+alinuta.lname);

        Person jon = new Person(2006, 'm',"jon","doe");
        jon.afiseaza();
        Person jeane = new Person(2000,'f',"jeane","doe");
        jeane.afiseaza();

        System.out.println(jon.fname);


    }
}