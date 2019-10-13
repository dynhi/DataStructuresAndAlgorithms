package Lab3;

import java.util.Arrays;
import java.util.Stack;

public class InfixToPostfix {
    private static int prec(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    private static String infixToPostfix(String exp){
        String result = new String("");
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++){
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)){
                result += c;
            }
            else if (c == '('){
                stack.push(c);
            }
            else if (c == ')'){
                while (!stack.isEmpty() && stack.peek() != '('){
                    result += stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression";
                else
                    stack.pop();
            }
            else {
                while (!stack.isEmpty() && prec(c) <= prec(stack.peek())){
                    result += stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }

    private static int evaluate(String str){
        Stack<Character> st = new Stack<>();
        int temp =0;
        for(int i=0; i< str.length(); i++){
            if (str.charAt(i)!= '+' && str.charAt(i)!= '-' && str.charAt(i)!= '*' && str.charAt(i)!= '/' && str.charAt(i)!= '(' && str.charAt(i)!= ')' ){
                st.push(str.charAt(i));
            }
            else{
                int a = st.pop() - '0';
                int b = st.pop() - '0';
                if ( str.charAt(i) == '+' ) {
                    temp = a + b;
                    st.push((char) (temp + '0'));
                }
                if ( str.charAt(i) == '-' ) {
                    temp = b - a;
                    st.push((char) (temp + '0'));
                }
                if ( str.charAt(i) == '*' ) {
                    temp = a * b;
                    st.push((char) (temp + '0'));
                }
                if ( str.charAt(i) == '/' ) {
                    temp = b / a;
                    st.push((char) (temp + '0'));
                }
            }
        }
        return st.pop() - '0';
    }


    public static void main(String args[]){
        String exp = "a+b*(c/d-e)*g-i/h";
        System.out.println(infixToPostfix(exp));
        String exp1 = "100-80/4*9-3+15/3";
        System.out.println(infixToPostfix(exp1));
        String exp2 = "1+2*3-4";
        System.out.println(infixToPostfix(exp2));
        System.out.println(evaluate(infixToPostfix(exp2)));
    }
}
