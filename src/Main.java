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

        Animal dog = new Animal("Rex","black",false);
        Animal cat = new Animal("Kitty","orange");

        dog.mananca();
        dog.doarme();
        System.out.println(dog.afiseazaCuloare());

        cat.mananca();
        cat.doarme();
        System.out.println(cat.afiseazaCuloare());

        //System.out.println(dog.name);

        Elev elev1 = new Elev("Popescu Andrei",9.68);
        Elev elev2 = new Elev("Ionescu Alina", 9.82);
        elev2.medieGenerala = 8.00;
        elev2.nume = "Pop Alina";
        Elev.diriginte = "noul dirig";

        elev1.afisareElev();
        elev2.afisareElev();

        EchipaFotbal echipa1 = new EchipaFotbal("Romania", 4);
        EchipaFotbal echipa2 = new EchipaFotbal("Belgia", 6);
        EchipaFotbal.campionat = "Euro 2024";
        EchipaFotbal.campionat = "Campionatul Mondial";

        echipa1.afiseaza();
        echipa2.afiseaza();

        EchipaFotbal.metodaStatica();

        Fotbalist fotbalist1 = new Fotbalist("Hagi");
        Voleibalist voleibalist1 = new Voleibalist();

        fotbalist1.seAntreneaza();
        fotbalist1.seRecupereaza();
        voleibalist1.seAntreneaza();
        voleibalist1.seRecupereaza();

        Cat cat1 = new Cat("Pisi","orange",false,"terestru");
        cat1.scoateSunete();
        Dog dog1 = new Dog("Azorel","brown",false,"terestru");
        dog1.scoateSunete();


        }







    }
