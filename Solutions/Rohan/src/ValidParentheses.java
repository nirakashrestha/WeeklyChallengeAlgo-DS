/*CLARIFYING QUESTIONS
 * Will the input string always contain only valid characters? - YES
 * Empty Strings? - YES
 * Multiple Parentheses? YES*/

/*THOUGHT PROCESS
* With the input string push opening brackets onto the stack and then pop them when a matching closing bracket is encountered.
* When encountering a closing bracket, check if it corresponds to the most recent opening bracket on the stack.
* At last, if the stack is empty its valid. if not empty its invalid as there may be some brackets not closed*/


import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (!isMatchingPair(top, c)) return false;
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));
        System.out.println(isValid("({[)]}"));
    }
}

/*TIME COMPLEXITY
* 0(n)
* because each character of the given input string is only processed once.*/

