import java.io.*;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) throws Exception {

        String s;
        int c=0;
        int linenumber=0;
        int num=0;
        String line;

        BufferedReader input = new BufferedReader(new FileReader("input.txt"));
        FileReader characters = new FileReader("input.txt");
        FileWriter out = new FileWriter("contacaratteri.txt");

        while((line = input.readLine()) != null){
           linenumber++;
        }

        while ((c = characters.read()) != -1){
            num++;
        }
        out.write("Numero caratteri= " + num);
        out.write("\nNumero righe= " + linenumber);

        out.flush();
        characters.close();
        out.close();
    }

}
