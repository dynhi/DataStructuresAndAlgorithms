package Lab4;

public class JosepusProblem {
    private CircularLinkedList theList;
    private int count;
    private int people;

    public JosepusProblem(int numPeople, int numCount, int startPoint){
        theList = new CircularLinkedList();
        count = numCount;
        people = numPeople;

        for (int i = 1; i <= numPeople; i++){
            theList.insert(i);
            theList.step();
        }

        theList.step();
        for (int i = 1; i < startPoint; i++){
            theList.step();
        }
    }

    private void display(){
        theList.display();
    }

    private CircularLink kill(){
        for (int i = 0; i < count - 1; i++){
            theList.step();
        }
        CircularLink temp = theList.delete();
        System.out.println("Killed #" + temp.data);
        theList.step();
        return temp;
    }

    public CircularLink execute(){
        CircularLink temp = new CircularLink(0);
        for (int i = 0; i < people - 1; i++){
            display();
            temp = kill();
        }
        System.out.println("Last person left is #" + temp.next.data);
        return temp;
    }
}
