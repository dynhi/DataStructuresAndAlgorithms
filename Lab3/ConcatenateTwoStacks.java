package Lab3;

import java.util.Stack;

public class ConcatenateTwoStacks {
    private static Stack<Integer> res = new Stack<>();

    private static void concatenate(Stack<Integer> stack1, Stack<Integer> stack2){
        while (stack1.size() != 0){
            res.push(stack1.peek());
            stack1.pop();
        }

        while (stack2.size() != 0){
            res.push(stack2.peek());
            stack2.pop();
        }
    }

    public static void main(String args[]){
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        s1.push(12);
        s1.push(45);
        s1.push(23);

        s2.push(34);
        s2.push(56);
        s2.push(26);

        concatenate(s1, s2);
        System.out.println("Concatenated two stacks: ");
        while (res.size() != 0){
            System.out.print(res.peek() + "  ");
            res.pop();
        }
    }
}
