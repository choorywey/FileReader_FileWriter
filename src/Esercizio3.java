import java.io.*;
import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) throws Exception {

        String line;
        int linenumber=1;

        BufferedReader input = new BufferedReader(new FileReader("input.txt"));
        FileWriter out = new FileWriter("Outputre.txt");

        while((line = input.readLine()) != null){
            System.out.println(linenumber + "- " + line);
            out.write(linenumber + "- " + line + "\n");
            linenumber++;
        }


        out.flush();
        input.close();
        out.close();
    }

}