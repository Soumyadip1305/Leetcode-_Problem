class Solution {
    public int minOperations(String[] logs) {
         int cnt = 0;
        for (String log : logs) {
            if (log.equals("./")) continue;
            else if (log.equals("../")) {
                if (cnt > 0) cnt--;
                else cnt=0;
            } else cnt++;
        }

        return cnt;
    }
}