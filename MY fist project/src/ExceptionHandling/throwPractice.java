package ExceptionHandling;

import java.util.Scanner;

public class throwPractice {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        try{
            if(age > 100){
                throw new MyException("age cannot be greater than 100");
            }
        } catch(MyException e){
            System.out.println(age);
            System.out.println(e.getErrorMessage());
        } finally{
            sc.close();
        }

    }
}



class MyException extends Exception{
    String message;
    
    public MyException(String message){
        super(message);
        this.message = message;
    }

    public String getErrorMessage(){
        return message;
    }
}
