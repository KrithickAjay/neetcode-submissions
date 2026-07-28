class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        
        // int min=Integer.MAX_VALUE;
        // for(int e=0;e<arr.length;e++){
        //     int sum=0;
        //     for(int s=e;s<arr.length;s++){
        //         sum+=arr[s];
        //         if(sum>=target){
        //             min=Math.min(min,s-e+1);
        //             break;
        //         }
        //     }
        // }
        // return min == Integer.MAX_VALUE ? 0 : min;

        int min=Integer.MAX_VALUE;
        int s=0;
        int sum=0;

        for(int e=0;e<arr.length;e++){
            sum+=arr[e];

            while(sum>=target){
                min=Math.min(min,e-s+1);
                sum-=arr[s++];
            }
            
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}