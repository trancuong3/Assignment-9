public class Calculator {

    public void sum(double a, double b) {
        System.out.println("Sum of two numbers: " + (a + b));
    }

    public void sum(double a, double b, double c) {
        System.out.println("Sum of three numbers: " + (a + b + c));
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(4.5, 3.2);
        calculator.sum(4.5, 3.2, 2.1);

    }
}