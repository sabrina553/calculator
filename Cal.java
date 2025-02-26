package Calculator;

import java.util.Scanner;

public class Cal {
    public void Cal(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type an equation: ");
        float a = scan.nextFloat();
        String operator = scan.next();
        float b = scan.nextFloat();

        System.out.println(a + operator + b + " = " +Calculator(a, b, operator));
    }

    private float Calculator(float a, float b, String operator) {
        switch (operator){
            case "*":
                return multiply(a,b);
            case "/":
                return divide(a,b);
            case "+":
                return add(a,b);
            case "-":
                return subtract(a,b);
        }
        return 0;
    }

    private float add(float a, float b){
        return(a+b);
    }
    private float subtract(float a, float b){
        return (a-b);
    }
    private float multiply(float a, float b){
        return(a*b);
    }
    private float divide(float a, float b){
        return(a/b);
    }
}

