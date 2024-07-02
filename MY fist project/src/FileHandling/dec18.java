package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class dec18 {
    public static void main(String[] args) throws IOException {
        String path = "MY fist project\\src\\Files\\file1.txt";
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        int character = br.read();
        int wordsCount = 0;
        int spaceCount = 0;
        int charactersCount = 0;
        int fullStopCount = 0;

        while(character != -1){

            switch ((char)character){
                case ' ':
                    spaceCount++;
                    wordsCount++;
                    break;
                case '\n':
                    wordsCount++;
                    break;
                case '.':
                    fullStopCount++;
                    break;
                default:
                    charactersCount++;
            }
            character = br.read();

        }

        System.out.println("Number of characters in file : " + charactersCount);
        System.out.println("Number of words in file : " + wordsCount);
        System.out.println("Numbers of spaces in file : " + spaceCount);
        System.out.println("Number of fullstops in file : " + fullStopCount);

        br.close();
        fr.close();
    }
}
