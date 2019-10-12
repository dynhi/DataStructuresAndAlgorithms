package Lab2;

import java.util.Random;

public class Array {
    private long[] a;
    private int nElems;

    public Array(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void randomInit(int numElements){
        Random aRandom = new Random();
        nElems = numElements;
        for (int i = 0; i < nElems; i++){
            a[i] = aRandom.nextLong() % 100000000;
        }
    }

    public void bubbleSort(){
        int out, in;
        for(out = nElems - 1; out > 1; out--){
            for (in = 0; in < out; in++){
                if (a[in] > a[in + 1]) {
                    long temp = a[in];
                    a[in] = a[in + 1];
                    a[in + 1] = temp;
                }
            }
        }
    }

    public void selectionSort(){
        int out, in, min;
        for (out = 0; out < nElems - 1; out++){
            min = out;
            for (in = out + 1; in < nElems; in++){
                if (a[in] < a[min])
                    min = in;
            }
            long temp = a[out];
            a[out] = a[min];
            a[min] = temp;
        }
    }

    public void insertionSort(){
        int in, out;
        for(out = 1; out < nElems; out++){
            long temp = a[out];
            in = out;
            while (in > 0 && a[in - 1] >= temp){
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }

    public void display(){
        for (int i = 0; i < nElems; i++){
            System.out.print(a[i] + " | ");
        }
        System.out.println();
    }

    Array (Array other){
        this.a = new long[other.nElems];
        this.nElems = other.nElems;
        for (int i = 0; i < nElems; i++){
            this.a[i] = other.a[i];
        }
    }
    public void bubbleSortDes(){
        int out, in, flag = 0;
        for(out = nElems - 1; out >= 1; out--){
            for (in = 0; in < out; in++){
                if (a[in] < a[in + 1]) {
                    long temp = a[in];
                    a[in] = a[in + 1];
                    a[in + 1] = temp;
                }
//                flag++;
//                System.out.print(flag + " try: ");
//                for (int i = 0; i < nElems; i++){
//                    System.out.print(a[i] + " | ");
//                }
//                System.out.println();
            }
        }
    }

    public void selectionSortDes(){
        int out, in, min;
        for (out = 0; out < nElems - 1; out++){
            min = out;
            for (in = out + 1; in < nElems; in++){
                if (a[in] > a[min])
                    min = in;
            }
            long temp = a[out];
            a[out] = a[min];
            a[min] = temp;
        }
    }

    public void insertionSortDes(){
        int in, out;
        for(out = 1; out < nElems; out++){
            long temp = a[out];
            in = out;
            while (in > 0 && a[in - 1] <= temp){
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }
}
