package Lab1;

import com.sun.org.apache.xml.internal.utils.res.LongArrayWrapper;

public class OrdArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray array = new OrdArray(maxSize);

        array.insert(77);
        array.insert(99);
        array.insert(44);
        array.insert(55);
        array.insert(22);
        array.insert(88);
        array.insert(11);
        array.insert(00);
        array.insert(66);
        array.insert(33);

        long searchKey = 55;
        if(array.find(searchKey) != array.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);
        array.display();

        array.delete(00);
        array.delete(55);
        array.delete(99);

        array.display();

        System.out.println("Merge 2 arrays");
        OrdArray array2 = new OrdArray(maxSize);
        array2.insert(12);
        array2.insert(23);
        array2.insert(1);
        array2.insert(34);
        array2.insert(45);
        array2.insert(56);

        System.out.println("Array 1:");
        array.display();
        System.out.println("Array 2:");
        array2.display();

        System.out.println("Merged array:");
        array.merge(array2).display();
    }

}
