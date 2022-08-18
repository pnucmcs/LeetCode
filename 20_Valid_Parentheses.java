import java.util.Stack;

class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stackName = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            char last;
            if (x == '(' || x == '[' || x == '{') {
                stackName.push(x);
                //continue;
            }
            if(stackName.empty()){
                return false;
            }
            if(x == ')' || x == ']' || x == '}'){
                last = stackName.peek();
                if(last == '(' && x == ')' || last == '[' && x == ']' || last == '{' && x == '}'){
                    stackName.pop();
                }else
                    return false;
            }
        }
        return stackName.empty();
    }
}