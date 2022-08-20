import java.util.PriorityQueue;

class Solution871 {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {

        /*
        int n = stations.length;
        long[] dp = new long[n+1];
        dp[0] = startFuel;
        for(int i = 0; i<n;i++){
            for(int refill = i; refill>=0 && dp[refill]>=stations[i][0]; refill--){
                dp[refill+1] = Math.max(dp[refill+1],dp[refill]+stations[i][1] );
            }
        }
        for (int i=0; i<=n;i++){
            if(dp[i]>=target){
                return i;
            }
        }
        return -1;
    */
        int n = stations.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1]-a[1]);

        int refill = 0, i = 0;
        int distance = startFuel;

        while (distance<target){
            while (i<n && distance >= stations[i][0]){
                pq.offer(stations[i]);
                i++;
            }
            if(pq.isEmpty()) return -1;
            distance += pq.remove()[1];
            refill++;
        }
        return refill;
    }
}