class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {

        int n =arr.length;
        int[] res=new int[n-k+1];
        
        int i=0;
        for(int e=0;e<n-k+1;e++){
            int max=arr[e];

            for(int s=e;s<e+k;s++){
                max=Math.max(max,arr[s]);

            }

            res[i++]=max;
        }
        return res;

        
    }
}