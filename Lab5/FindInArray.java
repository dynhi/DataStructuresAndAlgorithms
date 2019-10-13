package Lab5;

//code for question 6-7

public class FindInArray {
    private int findMin(int A[], int n){
        if (n == 1)
            return A[0];
        else
            //return Math.min(A[n - 1], findMin(A, n - 1));
        {
            int rMin = findMin(A, n - 1);
            if (A[n -1] < rMin)
                return A[n - 1];
            else
                return rMin;
        }
    }

    private int findSum(int A[], int n){
        if (n <= 0)
            return 0;
        else return (findSum(A, n - 1) + A[n - 1]);
    }

    public static void main(String[] args){
        FindInArray findInArray = new FindInArray();
        int array[] = {4, 26, 5, 9, 11, 0, 12, 18, 10};
        int n = array.length;
        System.out.println("Array is: ");
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " | ");
        System.out.println();
        System.out.println("Min of array is: " + findInArray.findMin(array, n));
        System.out.println("Sum of array is: " + findInArray.findSum(array, n));
    }
}
