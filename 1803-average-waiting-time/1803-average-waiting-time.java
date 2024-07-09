class Solution {
    public double averageWaitingTime(int[][] customers) {
      int n = customers.length;
        double time_waiting = customers[0][1];
        int prev_fin = customers[0][0] + customers[0][1];

        for (int i = 1; i < n; ++i) {
            int[] times = customers[i];
            int arrival = times[0];

            int cook_time = Math.max(arrival, prev_fin);
            int completion = cook_time + times[1];
            prev_fin = completion;
            time_waiting += completion - arrival;
        }

        return time_waiting / n;  
    }
}