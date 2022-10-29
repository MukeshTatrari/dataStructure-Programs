class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if ((c == ')' && !stack.isEmpty() && stack.peek() == '(')
                    || (c == ']' && !stack.isEmpty() && stack.peek() == '[')
                    || (c == '}' && !stack.isEmpty() && stack.peek() == '{')) {
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}