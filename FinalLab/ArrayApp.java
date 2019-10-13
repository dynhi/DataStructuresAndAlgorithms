package FinalLab;

public class ArrayApp {
    public static void main(String[] args){
        int maxSize = 20;
        int k = 6;
        int value;

        Array arr = new Array(maxSize);
        arr.randomInit(maxSize);
        arr.display();
        arr.median();
        arr.findClosetMediansInArray(10, arr, k);
    }
}
