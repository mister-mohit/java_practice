package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class fileRead {
    public static void main(String[] args) throws IOException{
        String path = "MY fist project\\src\\Files\\file1.txt";
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        int characterInt = br.read();
        int count = 0; 
        while(characterInt != -1){
            System.out.print((char)characterInt);
            count++;
            characterInt = br.read();
        }

        System.out.println("\nNumber of Character in file : " + count);

        String line = br.readLine();
        int lineCount = 0;
        while(lineCount != -1){
            lineCount++;
            line = br.readLine();
        }

        System.out.println("There are " + lineCount + "lines in the file.");

        br.close();
        fr.close();
    }
}
