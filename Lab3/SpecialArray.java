package Lab3;

import java.util.*;

public class SpecialArray {
    private List<Long> array = new ArrayList<>();
    private List<Long> tmpArray = new ArrayList<>();
    private static int nElement = 20;
    private Stack<List<Long>> stack = new Stack<>();
    private Stack<List<Long>> tmpStack = new Stack<>();

    private void randomInit() {
        Random aRandom = new Random();
        for (int i = 0; i < nElement; i++) {
            array.add(aRandom.nextLong() % 100);
        }
        stack.push(array);
    }

    private void print(){
        System.out.print(stack.peek());
        System.out.println();
    }

    private void update(int j, long value){
        System.out.println(tmpArray.size());
        System.out.println(array.size());
        for (Long temp: array){
            tmpArray.add(temp);
        }

        tmpArray.set(j, value);
        stack.add(tmpArray);
    }

    private void undo(){
        tmpStack.add(stack.pop());
    }

    private void redo(){
        stack.push(tmpStack.peek());
    }

    public static void main(String args[]){
        System.out.println("Initial array: ");
        SpecialArray specialArray = new SpecialArray();
        specialArray.randomInit();
        specialArray.print();
        System.out.println("Update value 33 at position 3: ");
        specialArray.update(3, 33);
        specialArray.print();
        System.out.println("Undo: ");
        specialArray.undo();
        specialArray.print();
        System.out.println("Redo: ");
        specialArray.redo();
        specialArray.print();
    }
}
