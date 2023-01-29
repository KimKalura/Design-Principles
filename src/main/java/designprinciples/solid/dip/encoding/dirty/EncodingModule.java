package designprinciples.solid.dip.encoding.dirty;

import java.io.*;
import java.util.Base64;

public class EncodingModule {


    public void encodeFromFileToFile() throws IOException {
        BufferedReader reader = null; // buffered extinde un reader
        BufferedWriter writer = null;
        try {

            reader = new BufferedReader(
                    new FileReader("src/main/java/designprinciples/solid/dip/encoding/dirty/fileToBeEncrypted.txt"));
            writer = new BufferedWriter(
                    new FileWriter("fileEncrypted.txt"));  // se creeaza cand vrem sa scriem, in alt loc, in root(in src.main.java)
                    //new FileReader+new FileWriter->asigura o conexiune  intre aplicatia java si un fisier
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes()); //base64 da un codificator;e un algoritm de codificare, care codifica din binar in text (adica din 0,1 in text)
                            //.getBytes()->transforma stringul intr-un array de bytes ca sa poate fi codificat de metoda lui base64 de codificare
                writer.append(encodedLine); //
            }
        } finally {
            if (writer != null) {
                writer.close(); // se inchide conexiunea fisierelor
            }
            if (reader != null) {
                reader.close();
            }
        }
    }

    public void encodeFromFileToDatabase() throws IOException {
        BufferedReader reader = null;
        StringBuilder inputString1 = new StringBuilder();
        try {
            reader = new BufferedReader(
                    new FileReader("src/main/java/designprinciples/solid/dip/encoding/dirty/fileToBeEncrypted.txt"));

            String aLine;
            while ((aLine = reader.readLine()) != null) {

                inputString1.append(aLine);
            }
        } finally {

            if (reader != null) {
                reader.close();
            }
        }
        String inputString = inputString1.toString();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
        System.out.println(database);
    }
}
