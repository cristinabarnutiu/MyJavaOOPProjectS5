package fisiere;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fisier {
    public static void main(String[] args) {

        File writeTo = new File("writeTo.txt"); //creem fisier nou

        try {
            writeTo.createNewFile();
            FileWriter writeSomething = new FileWriter("writeTo.txt"); //scriem in fisier
            writeSomething.write("Ana are mere");
            writeSomething.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File readFrom = new File("readFrom.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(readFrom);
            while(scanner.hasNextLine()){
                System.out.println(scanner.next());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }







    }
}
