import context.CalculatorContext;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        // Initialize context with an initial strategy
        CalculatorContext calculator = new CalculatorContext(new AddStrategy());
        System.out.println("10 + 5 = " + calculator.calculate(10, 5));

        // Dynamically switch strategy at runtime
        calculator.setStrategy(new SubtractStrategy());
        System.out.println("10 - 5 = " + calculator.calculate(10, 5));

        // Switch to multiplication
        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("10 * 5 = " + calculator.calculate(10, 5));

        // Switch to division
        calculator.setStrategy(new DivideStrategy());
        System.out.println("10 / 5 = " + calculator.calculate(10, 5));
    }
}