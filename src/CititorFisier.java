import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CititorFisier {
    ArrayList<String> continutFisier=new ArrayList<>();
    String line;
    public ArrayList<String> citesteDinFisier() throws IOException {
        try {
            FileReader fileReader=new FileReader("concurenti.csv");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                continutFisier.add(line);
            }


        } catch (FileNotFoundException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
        return continutFisier;

    }
}
