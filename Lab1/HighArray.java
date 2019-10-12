package Lab1;

public class HighArray {
    private long[] a;
    private int nElems;
    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey){
        int j;
        for (j = 0; j < nElems; j++){
            if (a[j] == searchKey)
                break;
        }
        if(j == nElems)
            return false;
        else
            return true;
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value){
        int j;
        for (j = 0; j < nElems; j++){
            if (value == a[j])
                break;
        }
        if (j == nElems)
            return false;
        else {
            for (int k = j; k < nElems; k++)
                a[k] = a[k+1];
            nElems--;
            return true;
        }
    }

    public void display(){
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println(" ");
    }

    public long getMax(){
        int j;
        long biggest = -1;
        if(nElems == 0)
            return biggest;
        else {
            for(j = 0; j < nElems; j++){
                if (a[j] > biggest)
                    biggest = a[j];
            }
            return biggest;
        }
    }

    public long removeMax(){
        int j;
        long biggest = -1;
        if (nElems == 0)
            return biggest;
        else{
            for (j = 0; j < nElems; j++){
                if(a[j] > biggest)
                    biggest = a[j];
            }
            delete(biggest);
            return biggest;
        }
    }

    public void noDups(){
        int size = nElems - 1;
        long value;
        for (int i = 0; i <= size; i++){
            value = a[i];
            for (int j = i + 1; j <= size; j++){
                if (a[j] == value){
                    for (int k = j; k < size; k++)
                        a[k] = a[k + 1];
                    nElems--;
                    j--;
                    size--;
                    System.out.println("Deleted " + value);
                }
            }
        }
    }
}
