package Lab1;

public class ArrayApp{
    public static void main(String[] args) {
        long[] arr;
        arr = new long[100];
        int nElem = 0;
        int j;
        long searchKey;
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElem = 10;
        for (j = 0; j < nElem; j++)
            System.out.print(arr[j] + " ");
        System.out.println(" ");
        searchKey = 66;
        for (j = 0; j < nElem; j++) {
            if (arr[j] == searchKey)
                break;
        }
        if (j == nElem)
            System.out.println("Can't find " + searchKey);
        else
            System.out.println("Found " + searchKey);

        searchKey = 55;
        for (j = 0; j < nElem; j++){
            if (arr[j] == searchKey)
                break;
        }
        for (int k = j; k < nElem - 1; k++)
            arr[k] = arr[k + 1];
        nElem--;
        for (j = 0; j < nElem; j++)
            System.out.print(arr[j] + " ");
        System.out.println(" ");
    }
}
