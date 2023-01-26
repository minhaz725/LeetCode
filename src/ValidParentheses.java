import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] set = s.toCharArray();
        Stack<Character> parenStack = new Stack<>();

        for (char c : set) {
            if(c == '(' || c == '{' || c == '[') parenStack.push(c);

            else if(c == ')' && !parenStack.isEmpty() && parenStack.peek() == '(') parenStack.pop();
            else if(c == '}' && !parenStack.isEmpty() && parenStack.peek() == '{') parenStack.pop();
            else if(c == ']' && !parenStack.isEmpty() && parenStack.peek() == '[') parenStack.pop();
            else return false;
        }
        return parenStack.isEmpty();
    }
}
