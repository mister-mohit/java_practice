public class FibonacciClass {
    public static class Fibonacci {

        public Fibonacci() {

        }
        
        public void printFibonacciSeries(int num){
            int a = 0;
            int b = 1;
            int c = 0;
            int temp = num;
            while(temp > 0){
                System.out.println(c);
                a = b;
                b = c;
                c = a + b;
                temp--;
            }
        }
    }

    public static void main(String[] args) {
        Fibonacci fibController = new Fibonacci();
        fibController.printFibonacciSeries(5);
    }
}
