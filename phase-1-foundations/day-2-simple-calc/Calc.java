import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double num1 = Double.parseDouble(sc.nextLine());

        System.out.print("Enter 2nd number: ");
        double num2 = Double.parseDouble(sc.nextLine());

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char op = sc.nextLine().charAt(0);

        Calculator calc = new Calculator(num1, num2, op);
        System.out.println("Answer: " + calc.solve());
    }
}
