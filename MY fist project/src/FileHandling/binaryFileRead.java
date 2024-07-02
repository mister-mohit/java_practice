package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class binaryFileRead {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "MY fist project\\src\\Files\\binaryFile1.dat";
        FileInputStream fis = new FileInputStream(path);

        int character;

        while((character = fis.read()) != -1){
            System.out.write((char)character);
            //System.out.print((char)character);
        }

        fis.close();


    }
}
