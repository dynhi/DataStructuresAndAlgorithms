package Lab1;

import java.util.Arrays;

public class SimpleApplication {
    public static int convertArrayToNumber(int a[]){
        int result = 0;
        if (a.length == 0)
            return 0;
        for (int i = 0; i <= a.length-1; i++){
            result = result * 10 + a[i];
        }
        return result;
    }

    public static long findMedian(long a[], int n){
        int low = 0;
        int high = n;
        int median = (low + high)/2;
        while (true){
            if (high <= low){
                return a[median];
            }
            if (high == low + 1){
                if (a[low] > a[high]){
                    swap(a[low], a[high]);
                }
                return a[median];
            }
            int middle = (low + high)/2;
            if (a[middle] > a[high]){
                swap(a[median], a[high]);
            }
            if (a[low] > a[high]){
                swap(a[low], a[high]);
            }
            if (a[middle] > a[low]){
                swap(a[middle], a[low]);
            }
            swap(a[middle], a[low + 1]);
            int low2 = low + 1;
            int high2 = high;
            while (true){
                while (a[low] > a[low2]){
                    low2++;
                }
                while (a[high2] > a[low]){
                    high2--;
                }
                if(high2 < low2)
                    break;
                swap(a[low2], a[high2]);
            }
            swap(a[low2], a[high2]);
            if(high2 <= median){
                low = low2;
            }
            if (high2 >= median){
                high = high2 - 1;
            }
        }
    }

    public static void swap(long int1, long int2){
        long temp = int1;
        int1 = int2;
        int2 = temp;
    }

    public static long minGap(long a[]){
        if (a.length < 2)
            return 0;
        long min;
        min = a[1] - a[0];
        for (int i = 1; i <= a.length - 2; i++){
            if((a[i + 1] - a[i]) < min)
                min = a[i + 1] - a[i];
        }
        return min;
    }

    public static void main(String[] args){
        int array[] = {2, 0, 1, 8};
        long a[] = {12, 23, 34, 45, 56, 67, 78, 89, 90};
        int n = a.length;
        System.out.println("Result of A is: Convert array to integer: " + convertArrayToNumber(array));
        System.out.println("Result of B is: Median: " + findMedian(a, n));
        System.out.println("Result of C is: Min gap: " + minGap(a));
    }
}
