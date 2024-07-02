package ExamPrep;

import java.util.Scanner;

public class fibonacciSequence {

    public static void printFibonacci(int num){
        int a = 0;
        int b = 1;
        int c = a + b;

        System.out.println("Fibonnaci sequence");
        for(int i = 0; i < num; i++){
            System.out.println(a);
            a = b;
            b = c;
            c = a + b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        printFibonacci(num);
        
        sc.close();
    }
}
