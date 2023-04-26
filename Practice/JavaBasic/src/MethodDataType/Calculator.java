package MethodDataType;

public class Calculator {

    public static int tong(int a, int b){
        return a + b;
    }
    public static double tich (double c, double d){
        return c * d;
    }
    public static void main(String[] args) {
        System.out.println(Calculator.tong(20,30));
        System.out.println(Calculator.tich(10, 5.5));
    }

}
