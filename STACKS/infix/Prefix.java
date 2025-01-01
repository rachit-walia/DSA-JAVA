
import java.util.*;

public class Prefix {

    public static void main(String[] args) {
        String expression = "-+7*45+20"; // Example prefix expression
        System.out.println("Result of Prefix Evaluation: " + evaluatePrefix(expression));
    }

    public static int evaluatePrefix(String expression) {
        Stack<Integer> stack = new Stack<>();
        for (int i = expression.length() - 1; i >= 0; i--) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // Convert character to integer
            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                stack.push(applyOperation(ch, operand1, operand2));
            }
        }
        return stack.peek();
    }

    private static int applyOperation(char operator, int operand1, int operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
