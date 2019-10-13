package Lab5;

//code for question 4-5

public class Sum {
    private double sum(int n){
        if (n == 0)
            return 0;
        else
            return (double) 1/n + sum(n - 1);
    }

    private int sumInt(int n){
        if (n == 0)
            return 0;
        else
            return n + sumInt(n - 1);
    }

    public static void main(String[] args){
        Sum testSum = new Sum();
        System.out.println("Test cases for question 4: ");
        System.out.println("n = 0, sum is " + testSum.sum(0));
        System.out.println("n = 1, sum is " + testSum.sum(1));
        System.out.println("n = 5, sum is " + testSum.sum(5));
        System.out.println("Test cases for question 5: ");
        System.out.println("n = 0, sum is " + testSum.sumInt(0));
        System.out.println("n = 1, sum is " + testSum.sumInt(1));
        System.out.println("n = 10, sum is " + testSum.sumInt(10));
    }
}
