package FinalLab;

import java.util.Random;

public class Array {
    private int[] a;
    private int nElem;

    public Array(int max){
        a = new int[max];
        nElem = 0;
    }

    public void randomInit(int nElement){
        Random aRandom = new Random();
        nElem = nElement;
        for (int i = 0; i < nElement; i++){
            a[i] = aRandom.nextInt() % 100;
        }
    }

    public void insertionSort(){
        int in, out;
        for(out = 1; out < nElem; out++){
            int temp = a[out];
            in = out;
            while (in > 0 && a[in - 1] >= temp){
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }

    public void display(){
        for (int i = 0; i < nElem; i++){
            System.out.print(a[i] + " | ");
        }
        System.out.println();
    }

    private void returnLeft(int key, int n){
        while (n > 0){
            System.out.print(a[key - n] + "  ");
            n--;
        }
    }

    private void returnRight(int key, int n){
        while (n > 0){
            System.out.print(a[key + n] + "  ");
            n--;
        }
    }

    public int median() {
        int median;
        if (nElem % 2 == 0) {
            median = ((a[nElem / 2] + a[nElem / 2 - 1]) / 2);
        } else {
            median = a[nElem / 2];
        }
        System.out.println("Median is: " + median);
        return median;
    }

    public long getMin() {
        int position;
        if (a.length == 0) {
            System.out.println("Array is empty!");
            return -1;
        } else {
            long min = a[0];
            for (int i = 0; i < a.length; i++) {
                if (min >= a[i]) {
                    min = a[i];
                    position = i;
                }
            }
            return min;
        }
    }
    public void findClosetMediansInArray(int size, Array arr, int k) {
        int leftP, rightP;
        long[] result;
        result = new long[20];
        int maxSize = size; // array size
        arr = new Array(maxSize); // create the array
        arr.randomInit(maxSize);
        arr.insertionSort();
        arr.display();

        long median = arr.median();
        System.out.println("Median:" + median);
        if ( size % 2 == 0) {
            leftP = size/2 - 1;
            rightP = size/2;
        } else {
            leftP = size/2 -1;
            rightP = size/2 +1;
        }
        System.out.print("Closet medians:");
        for(int i = 0; i < k; i++) {
            if( (Math.abs(arr.a[leftP] - median))  < Math.abs(arr.a[rightP] - median)) {
                result[i] = arr.a[leftP--];
                System.out.print(result[i]+ " ");
            } else {
                result [i] = arr.a[rightP++];
                System.out.print(result[i]+ " ");
            }
        }
    }

    public void removeMin() {
        delete(getMin());
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElem; j++)
            if (value == a[j])
                break;
        if (j == nElem)
            return false;
        else
        {
            for (int k = j; k < nElem-1; k++)
                a[k] = a[k + 1];
            nElem--;
            return true;
        }
    }
}
