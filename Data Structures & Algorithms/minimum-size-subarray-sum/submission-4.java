class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        
        int min=Integer.MAX_VALUE;
        for(int e=0;e<arr.length;e++){
            int sum=0;
            for(int s=e;s<arr.length;s++){
                sum+=arr[s];
                if(sum>=target){
                    min=Math.min(min,s-e+1);
                }
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
        
    }
}