class Solution {
    public int maxSubArray(int[] arr) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int e=0;e<arr.length;e++){
            sum+=arr[e];
            sum=Math.max(sum,arr[e]);
            max=Math.max(sum,max);
        }
        return max;
    }
}
