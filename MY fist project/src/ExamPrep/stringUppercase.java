package ExamPrep;

import java.util.Scanner;

public class stringUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();

        String upperCasedStr = str.toUpperCase();

        System.out.println(upperCasedStr);

        sc.close();
    }
}
