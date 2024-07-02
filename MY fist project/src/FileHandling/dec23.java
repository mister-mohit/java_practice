package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class dec23 {
    public static void main(String[] args) throws IOException {
        // creating file and fileReader object of file from which we read
        String path = "MY fist project\\src\\Files\\file1.txt";
        File readerfile = new File(path);
        FileReader fr = new FileReader(readerfile);
        BufferedReader br = new BufferedReader(fr);

        //creating file and fileWriter object of file in which we write
        String path2 = "MY fist project\\src\\Files\\ignou.txt";
        File writerfile = new File(path2);
        FileWriter fw = new FileWriter(writerfile);
        BufferedWriter bw = new BufferedWriter(fw);


        //read readerFile line by line and put the data into writerFile
        String line = br.readLine();

        while(line != null){
            bw.write(line);
            line = br.readLine();
        }

        br.close();
        bw.close();
        fr.close();
        fw.close();


    }
}
