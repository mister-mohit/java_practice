import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string");
        String input = sc.nextLine();

        String upperCaseString = input.substring(0,1).toUpperCase() + input.substring(1);

        System.out.println(upperCaseString);

        sc.close();
    }
}
