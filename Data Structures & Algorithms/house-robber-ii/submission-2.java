class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
        if(n==1) return arr[0];
        if(n==2) return Math.max(arr[0],arr[1]); 
        return Math.max( rob(arr,0,n-2), rob(arr,1,n-1));
    }
    public int rob(int[] arr,int start,int end){
        int[] dp=new int[arr.length-1];
        dp[0]=arr[start];
        dp[1]=Math.max(arr[start],arr[start+1]);
        for(int i=2;i<dp.length;i++){
           int num1= arr[start+i] + dp[i-2];
           int num2 = dp[i-1];
           dp[i]=Math.max(num1,num2);
        }
        return dp[dp.length-1];
    }
}
