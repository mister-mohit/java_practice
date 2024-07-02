package ExceptionHandling;

public class tryCatch {
    public static void main(String[] args) {

        int arr[] = new int[5];

        try{
            System.out.println(arr[8]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    
    }

}
