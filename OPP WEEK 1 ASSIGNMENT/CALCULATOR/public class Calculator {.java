public class Calculator {

    // Attributes
    private double[] numbers;
    private double result;

    // Store numbers
    public void setNumbers(double[] numbers) {
        this.numbers = numbers;
    }

    // Addition
    public void add() {
        result = 0;

        for (double num : numbers) {
            result += num;
        }
    }

    // Subtraction
    public void subtract() {
        result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
    }

    // Multiplication
    public void multiply() {
        result = 1;

        for (double num : numbers) {
            result *= num;
        }
    }

    // Division
    public void divide() {
        result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] == 0) {
                System.out.println("Cannot divide by zero.");
                return;
            }

            result /= numbers[i];
        }
    }

    // Square Root
    public void squareRoot() {

        System.out.println("Square Roots:");

        for (double num : numbers) {

            if (num < 0) {
                System.out.println(num + " -> Not Possible");
            } else {
                System.out.println(num + " -> " + Math.sqrt(num));
            }
        }
    }

    // Show Result
    public void show() {
        System.out.println("Result = " + result);
    }
}