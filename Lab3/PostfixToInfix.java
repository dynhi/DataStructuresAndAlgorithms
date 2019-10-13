package Lab3;

import java.util.Stack;

public class PostfixToInfix {
    private static boolean isOperand(char x){
        return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z') || (x >= '0' && x <= '9');
    }

    private static String getInfix(String exp){
        Stack<String> s = new Stack<>();
        for (int i = 0; i < exp.length(); i++){
            if(isOperand(exp.charAt(i))){
                s.push(exp.charAt(i) + " ");
            }
            else {
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
                s.push("(" + op2 + exp.charAt(i) + op1 + ")");
            }
        }
        return s.peek();
    }

//    private static void tokenize(String expression){
//        String token = new String("");
//        while (){
//            char c = expression.charAt(i);
//            if(Character.isDigit(c)){
//                token += c;
//            }
//        }
//    }

    public static void main(String args[]){
        String exp = "abcd/e-*g*+ih/-";
        System.out.println(getInfix(exp));
        String exp1 = "123-56*+";
        System.out.println(getInfix(exp1));
    }
}
