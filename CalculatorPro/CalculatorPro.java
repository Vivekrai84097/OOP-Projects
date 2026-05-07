package CalculatorPro;

class Calculator{

    public void add(int a, int b){
        System.out.println("Add : " + (a + b));
    }

    public void add(double num1, double num2){
        System.out.println("Add : " + (num1 + num2));
    }
    
    public void add(int a, int b, int c){
        System.out.println("Add : " + (a+b+c));
    }
}

public class CalculatorPro {
    
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(5, 15);
        c.add(3.14, 5.21);
        c.add(5, 15, 55);
    }
}
