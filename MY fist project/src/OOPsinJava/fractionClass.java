package OOPsinJava;

public class fractionClass {

    public static class Fraction{
        int num;
        int den;

        public Fraction(int num, int den){
            this.num = num;
            this.den = den;
        }

        public void simplify(){
            int hcf = gcd(num,den);
            num /= hcf;
            den /= hcf;
        } 

        public int gcd(int num, int den){
            int min = Math.min(num,den);
            for(int i=min; i>=1; i--){
                if( num%i==0 && den%i==0) return i;
            }
            return min;
        }
    }

    public static void add2(Fraction f1, Fraction f2){
        int numerator = f1.num*f2.den + f2.num*f1.den;
        int denominator = f1.den*f2.den;
        f1.num = numerator;
        f1.den = denominator;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(4,6);
        Fraction f2 = new Fraction(5,6);
        add2(f1, f2);
        f1.simplify();
        System.out.println(f1.num+"/"+f1.den);
    }

}
