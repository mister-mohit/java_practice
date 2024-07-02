package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;

public class fileWrite  {
    public static void main(String[] args) throws IOException {
        String path = "MY fist project\\src\\Files\\file1.txt";
        File file = new File(path);
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the content : ");
        String str = sc.nextLine();

        bw.write(str);
        
        bw.close();
        fw.close();
        sc.close();
    }
}
