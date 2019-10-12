package Lab1;

public class HighArrayApp {
    public static void main(String[] args){
        int maxSize = 100;
        HighArray array;
        array = new HighArray(maxSize);

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

        array.display();

        int searchKey = 35;
        System.out.println("Find 35");
        if(array.find(35))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);
        System.out.println("Delete 00, 55, 99");
        array.delete(00);
        array.delete(55);
        array.delete(99);

        array.display();

        array.insert(25);
        array.insert(25);
        array.insert(25);

        array.display();
        System.out.println("The maximum of the array is " + array.getMax());
        array.display();
        System.out.println("Remove max");
        array.removeMax();
        array.display();
        System.out.println("Remove duplicates");
        array.noDups();
        array.display();

    }
}
