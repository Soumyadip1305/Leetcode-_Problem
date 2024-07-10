class Solution {
    public int minOperations(String[] logs) {
        int cnt = 0;
        for (String log : logs) {
            switch (log) {
                case "./":
                    break;
                case "../":
                    if (cnt > 0) {
                        cnt--;
                    }
                    break;
                default:
                    cnt++;
                    break;
            }
        }
        return cnt;
    }
}