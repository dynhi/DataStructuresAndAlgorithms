package Lab3;

import java.util.Stack;

public class DecimalToOctal extends Stack {
    private int decimal;

    private DecimalToOctal(int n){
        super();
        decimal = n;
    }

    private void setOctal(){
        if(decimal == 0)
            push(0);
        while (decimal > 0){
            int digit = decimal % 8;
            push(digit);
            decimal /= 8;
        }
    }

    private String toOctal(){
        String h = "";
        while (!isEmpty()){
            h += pop();
        }
        return h;
    }

    public static void main(String arg[]){
        DecimalToOctal decimal1 = new DecimalToOctal(19);
        decimal1.setOctal();
        System.out.println("Decimal to octal of 19 is: " + decimal1.toOctal());
        DecimalToOctal decimal2 = new DecimalToOctal(99);
        decimal2.setOctal();
        System.out.println("Decimal to octal of 99 is: " + decimal2.toOctal());
    }
}
