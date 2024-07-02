package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class june20 {
    public static void main(String[] args) throws IOException {
        String path = "MY fist project\\src\\Files\\file1.txt";
        File file = new File(path);
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text");
        String myStr = sc.nextLine();

        bw.write(myStr);
        System.out.println("Done");

        bw.close();
        fw.close();
    }
}
