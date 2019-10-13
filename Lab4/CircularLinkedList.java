package Lab4;

public class CircularLinkedList {
    private CircularLink current;
    private int nItem;
    public CircularLinkedList(){
        current = null;
        nItem = 0;
    }

    public boolean isEmpty(){
        return current == null;
    }

    public long getItem(){
        return nItem;
    }

    public void step(){
        current = current.next;
    }

    public void insert(long value){
        if(isEmpty()){
            current = new CircularLink(value);
            current.next = current;
        }
        else {
            CircularLink newLink = new CircularLink(value);
            newLink.next = current.next;
            current.next = newLink;
        }
        nItem++;
    }

    public CircularLink search(long value){
        for (int i = 0; i < nItem; i++){
            if (current.data == value){
                System.out.println("Found " + value);
                return current;
            }
            else step();
        }
        System.out.println("Couldn't find " + value);
        return null;
    }

    public CircularLink delete(){
        if (isEmpty()){
            System.out.println("List is empty.");
            return null;
        }
        else if (nItem == 1){
            current = null;
            nItem = 0;
            return null;
        }
        else {
            CircularLink temp = current.next;
            current.next = current.next.next;
            nItem--;
            return temp;
        }
    }

    public CircularLink peek(){
        return current;
    }

    public void display(){
        System.out.print("Circular list: ");
        CircularLink index = current;
        for (int i = 0; i < nItem; i++){
            System.out.print(index.data + "   ");
            index = index.next;
        }
        System.out.println();
    }
}
