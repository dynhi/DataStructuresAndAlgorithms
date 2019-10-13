package Lab4;

public class CircularLink {
    public long data;
    public CircularLink next;
    public CircularLink(long value){
        data = value;
    }
    public void displayLink(){
        System.out.println(data + "   ");
    }
}
