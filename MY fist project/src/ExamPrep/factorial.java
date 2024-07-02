package ExamPrep;
import java.util.Scanner;

public class factorial {

    public static int findFactorial(int num){
        int prod = 1;

        for(int i = num; i > 0; i--){
            prod *= i;
        }
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find Factorial:");
        int num = sc.nextInt();

        int factorial = findFactorial(num);
        System.out.println(factorial);

        sc.close();

    }
}
