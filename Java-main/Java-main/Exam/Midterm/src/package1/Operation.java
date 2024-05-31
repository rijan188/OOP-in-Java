package package1;

class Calculator implements ArithmeticOperation{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int add(int a, int b, int c) {
        return a+b+c;
    }

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }
}

public class Operation{
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println("x+y="+c1.add(2,4));
        System.out.println("x+y+z="+c1.add(2,4,6));
        System.out.println("x+y="+c1.add(2.2,4.4));
        System.out.println("x-y="+c1.subtract(10,8));
        System.out.println("x*y="+c1.multiply(3,3));
    }
}
