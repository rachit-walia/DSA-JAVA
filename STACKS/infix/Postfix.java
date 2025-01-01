
import java.util.*;

public class Postfix {

    public static void main(String[] args) {
        String expression = "45*72+-"; // Example postfix expression
        System.out.println("Result of Postfix Evaluation: " + evaluatePostfix(expression));
    }

    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // Convert character to integer
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
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
