package Lab3;

import java.util.Scanner;
import java.util.Stack;

public class ArithmeticExp {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter expression:");
         String str = sc.nextLine();
         System.out.println("The result is: ");
         Stack<Character> st = new Stack<>();
         System.out.println(evaluate(st, str));


     }

     public static int evaluate(Stack<Character> st, String str){

         int temp =0;
         for(int i=0; i< str.length(); i++){
             if (str.charAt(i)!= '+' && str.charAt(i)!= '-' && str.charAt(i)!= '*' && str.charAt(i)!= '/' && str.charAt(i)!= '(' && str.charAt(i)!= ')' ){st.push(str.charAt(i));}
             else{
                 int a =st.pop() - '0'; // substract the value of '0 ' to get the int value
                 int b= st.pop() - '0';
                 if ( str.charAt(i) == '+' ) { temp = a + b; st.push((char) (temp + '0'));}
                 if ( str.charAt(i) == '-' ) { temp = a - b; st.push((char) (temp + '0'));}
                 if ( str.charAt(i) == '*' ) { temp = a * b; st.push((char) (temp + '0'));}
             if ( str.charAt(i) == '/' ) { temp = a / b; st.push((char) (temp + '0'));}
             if ( str.charAt(i) == '(' ) {  }
             if ( str.charAt(i) == ')' ) {  }
             }
         }
         return st.pop() - '0';
     }

}
