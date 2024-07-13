class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        String[] ans = new String[(n + k - 1) / k];

        for (int i = 0; i < (n + k - 1) / k; i++) {
            int start = i * k;
            int end = Math.min(start + k, n);
            StringBuilder sb = new StringBuilder(s.substring(start, end));
            while (sb.length() < k) {
                sb.append(fill);
            }

            ans[i] = sb.toString();
        }

        return ans;
    }
}