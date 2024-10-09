/*
    Clarifying Questions: 
    The question in itself is pretty clear. so the different characters it can contain is (), {}, [],

    Can the input string be empty string?

    Thought Process: 
    For this, i am going to utilise stack data structure. Since stack follows a property of First In Last Out.
    I will iterate over a characters of a string, as i encounter a open parentheses, i will insert it into stack,
    As soon as i encounter a closing parentheses, I will pop the stack, and check if the popped element is a open parentheses of the same type.
    if it is then we continue with the expression, if not then it implies there is a mismatch.
    

    Edge cases:
    if the input string is empty then there will be nothing inserted into stack, so its a valid string
    if the input string only contains open parentheses, then nothing will get popped from the stack resulting in stack not being empty so output will be false.
    if the input string only contains closing parentheses, then the stack will be empty which means, there was no corresponding opening parentheses before for it.

    Time Complexity:O(N)
    Space Complexity:O(N) because of the stack that holds the characters as we are iterating. 
 */

import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

    Map<Character, Character> map = Map.of(
        ')', '(',
        '}', '{',
        ']', '['
    );
    


    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character character : s.toCharArray()) {
            if(character == '(' || character == '{' || character == '['){
                stack.add(character);
            }
            else if(character == ')' || character == '}' || character == ']'){
                if(!stack.isEmpty()){
                    char c = stack.pop();
                    char v = map.get(character);
                    
                    if(c == v){
                        continue;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
      
    }

    public static void main(String[] args){
        ValidParenthesis v = new ValidParenthesis();
        String s1 = "()[]{}"; //true
        String s2 = "(";//false
        String s3 = "(]"; //false
        String s4 = "([])"; //true
        String s5 = ")";//false


        System.out.println(v.isValid(s1));
        System.out.println(v.isValid(s2));
        System.out.println(v.isValid(s3));
        System.out.println(v.isValid(s4));
        System.out.println(v.isValid(s5));


        
    }
    
}
