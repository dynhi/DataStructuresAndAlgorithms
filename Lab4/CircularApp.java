package Lab4;

public class CircularApp {
    public static void main(String[] args){
        CircularLinkedList theList = new CircularLinkedList();
        theList.insert(12);
        theList.insert(2);
        theList.insert(3);
        theList.insert(25);
        theList.display();

        theList.delete();
        theList.display();
        theList.delete();
        theList.display();
    }
}
