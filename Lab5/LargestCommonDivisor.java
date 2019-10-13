package Lab5;

//code for question 8

public class LargestCommonDivisor {
    private long gcd(long a, long b){
        if (b == 0)
            return a;
        else if (a == 0)
            return b;
        else return gcd(b, a%b);
    }
    public static void main(String[] args){
        LargestCommonDivisor test = new LargestCommonDivisor();
        System.out.println("Largest Common Divisor of 1000 and 0 is " + test.gcd(1000, 0));
        System.out.println("Largest Common Divisor of 0 and 500 is " + test.gcd(0, 500));
        System.out.println("Largest Common Divisor of 12 and 18 is " + test.gcd(12, 18));
        System.out.println("Largest Common Divisor of 6 and 4 is " + test.gcd(6, 4));
        System.out.println("Largest Common Divisor of 36 and 48 is " + test.gcd(36, 48));
    }
}
