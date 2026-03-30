public class Error {
    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 0;

        try {
            System.out.println(numerator / denominator);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero" + e);
        } finally {
            System.out.println("Program completed");
        }
    }
}
