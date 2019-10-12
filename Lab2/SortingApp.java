package Lab2;


public class SortingApp {
    public static void main(String[] args){
        int maxSize = 10000;
        long startTime, endTime, duration;
        Array arr = new Array(maxSize);
        arr.randomInit(maxSize);
        Array arr1 = new Array(arr);
        Array arr2 = new Array(arr);


        arr.display();
        arr.bubbleSortDes();
        arr.display();
        //arr.bubbleSort();
        startTime = TimeUtils.now();
        arr.bubbleSort();
        endTime = TimeUtils.now();
        arr.display();
        duration = endTime - startTime;
        System.out.println("Time for bubble sort: " + duration + " ms");

        arr1.display();
        arr1.insertionSortDes();
        arr1.display();
        //arr1.insertionSort();
        startTime = TimeUtils.now();
        arr1.insertionSort();
        endTime = TimeUtils.now();
        arr1.display();
        duration = endTime - startTime;
        System.out.println("Time for insertion sort: " + duration + " ms");


        arr2.display();
        arr2.selectionSortDes();
        arr2.display();
        //arr2.selectionSort();
        startTime = TimeUtils.now();
        arr2.selectionSort();
        endTime = TimeUtils.now();
        arr2.display();
        duration = endTime - startTime;
        System.out.println("Time for selection sort: " + duration + " ms");
    }
}
