class Solution {
    public String reverseParentheses(String s) {
         char[] chars = s.toCharArray();
        int n = chars.length;

        // Keep processing until there are no more parentheses
        while (true) {
            int left = -1, right = -1;
            for (int i = 0; i < n; i++) { // Find the innermost '('
                if (chars[i] == '(') {
                    left = i;
                } else if (chars[i] == ')') {// Find the innermost ')'
                    right = i;
                    break;
                }
            }

            // If there are no more parentheses, break the loop
            if (left == -1 || right == -1) {
                break;
            }
            // Reverse the substring between 'left' and 'right'
            reverse(chars, left + 1, right - 1);

            // Remove the parentheses by shifting the characters
            for (int i = right; i < n - 1; i++) {
                chars[i] = chars[i + 1];
            }
            for (int i = left; i < n - 2; i++) {
                chars[i] = chars[i + 1];
            }
            n -= 2;  // Reduce the length of the string by 2
        }
        return new String(chars, 0, n);
    }
    private void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}