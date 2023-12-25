package assignment;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReadWrite {
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        String str = "My name is Atharva";
        
        // Writing in file
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write(str);
            fw.close();
            System.out.println("Writing successful");
        } catch (IOException e) {
            System.out.println("Error occurred while writing " + e);
        }

        // Reading from file
        try {
            String contentRead = new String(Files.readAllBytes(Paths.get(fileName)));
            System.out.println("Contents read from the file: " + contentRead);
        } catch (IOException e) {
            System.out.println("Error occurred while reading " + e);
        }
    }
}