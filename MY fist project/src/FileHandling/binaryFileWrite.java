package FileHandling;
import java.io.FileOutputStream;
import java.io.IOException;

public class binaryFileWrite {

    public static void main(String[] args) {
        String filePath = "MY fist project\\src\\Files\\binaryFile1.dat";
        String data = "This is some data to write to the file.";
        
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

}
