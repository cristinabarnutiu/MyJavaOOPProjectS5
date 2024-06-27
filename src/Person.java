public class Person {
    int birthYear;
    char sex;
    String fname;
    String lname;

    public Person(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person(char sex, String fname, String lname) {
        this.sex = sex;
        this.fname = fname;
        this.lname = lname;
    }

    public Person(int birthYear, char sex, String fname, String lname) {
        this.birthYear = birthYear;
        this.sex = sex;
        this.fname = fname;
        this.lname = lname;
    }

    //    Person(){
//        birthYear = 2006;
//    }
//
//    Person (char sex, String fname, String lname){
//        this.sex = sex; //this se refera la atributul din clasa curenta
//        this.fname = fname;
//        this.lname = lname;
//    }

    public int returnAge(){
        return 2024-birthYear;
    }

    public void afiseaza(){
        System.out.println(fname+" are "+returnAge()+" ani.");
    }




}
