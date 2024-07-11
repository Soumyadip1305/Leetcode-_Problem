class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
                // Push the reversed string back to the stack
                for (int j = 0; j < sb.length(); j++) {
                    stack.push(sb.charAt(j));
                }
            } else stack.push(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        for (char ch:stack)sb.append(ch);
        return sb.toString();
    }
}