package ExamPrep;

import java.util.Scanner;

public class elementSearch {
    public static int searchElement(int[] arr, int num){
        int length = arr.length;

        for(int i = 0; i < length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {24,35,4,6,35,45,6,7,3,6,33,55,744,76,32};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find");
        int num = sc.nextInt();

        int index = searchElement(arr, num);

        if(index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index : " + index);
        }

        sc.close();
    }
}
