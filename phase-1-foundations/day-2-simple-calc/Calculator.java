public class Calculator {
    // Instance Variables
    private double num1;
    private double num2;
    private char operation;

    // Constructor
    public Calculator(double num1, double num2, char operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    // Method
    public double solve() {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '/':
                return num1 / num2;
            case '*':
                return num1 * num2;
            case '%':
                return num1 % num2;
            default:
                System.out.println("Invalid operator");
                return 0;
        }
    }
}
