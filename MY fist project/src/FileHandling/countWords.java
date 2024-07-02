package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class countWords {
    public static void main(String[] args) throws IOException {
        String path = "MY fist project\\src\\Files\\file1.txt";
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        int character = br.read();
        int wordsCount = 0;

        while(character != -1){
            if((char)character == ' ' && (char)character == '\n'){
                wordsCount++;
            }
            character = br.read();
        }

        System.out.println("There are " + wordsCount + " words in the file.");

        br.close();
        fr.close();
    }
}
