class Solution {
    public int minCostClimbingStairs(int[] arr) {

        // if(arr.length == 2) return Math.min(arr[0],arr[1]);
        // int[] dp = new int[arr.length];

        // dp[0]=arr[0];
        // dp[1]=arr[1];

        // for(int i=2;i<arr.length;i++){
        //     dp[i] = Math.min(arr[i] + dp[i-1] , arr[i] + dp[i-2]);
        // }


        // return Math.min(dp[arr.length-1] , dp[arr.length-2]);

        int dp2 = arr[0];
        int dp1 = arr[1];

        for(int i=2;i<arr.length;i++){
            int curr = Math.min(dp1,dp2) + arr[i];
            dp2 = dp1;
            dp1 = curr;
        }

        return Math.min(dp1,dp2);
    }
}
