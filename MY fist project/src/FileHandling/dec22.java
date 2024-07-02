package FileHandling;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class dec22 {
    public static void main(String[] args)throws IOException {
        String path = "MY fist project\\src\\Files\\ignou.txt";
        File file = new File(path);
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Hello IGNOU");

        bw.close();
        fw.close();
    }
}
