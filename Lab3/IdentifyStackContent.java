package Lab3;

import java.util.Stack;

public class IdentifyStackContent {
    public static boolean equals(Stack<Integer> s1, Stack<Integer> s2){
        Stack<Integer> tmp = new Stack<>();
        boolean equal = true;
        while (!s1.isEmpty() && !s2.isEmpty()){
            int first = s1.pop();
            int second = s2.pop();
            tmp.push(first);
            tmp.push(second);
            if (first != second){
                equal = false;
                break;
            }
        }

        if (!(s1.isEmpty() || s2.isEmpty())){
            equal = false;
        }

        while (!tmp.isEmpty()){
            s1.push(tmp.pop());
            s2.push(tmp.pop());
        }
        return equal;
    }

    public static void main(String args[]) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();

        s1.push(12);
        s1.push(45);
        s1.push(23);

        s2.push(34);
        s2.push(56);
        s2.push(26);

        s3.push(12);
        s3.push(45);
        s3.push(23);

        System.out.println("Contents of first stack: ");
        while (s1.size() != 0) {
            System.out.print(s1.peek() + "  ");
            s1.pop();
        }
        System.out.println();

        System.out.println("Contents of second stack: ");
        while (s2.size() != 0) {
            System.out.print(s2.peek() + "  ");
            s2.pop();
        }
        System.out.println();

        System.out.println("Contents of third stack: ");
        while (s3.size() != 0) {
            System.out.print(s3.peek() + "  ");
            s3.pop();
        }
        System.out.println();

        if (equals(s1, s2))
            System.out.println("Contents of first stack are identical to second stack.");
        else
            System.out.println("Contents of first stack are not identical to second stack.");

        if (equals(s1, s3))
            System.out.println("Contents of first stack are identical to third stack.");
        else
            System.out.println("Contents of first stack are not identical to third stack.");
    }
}
