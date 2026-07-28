class Solution {
    public int subarraySum(int[] arr, int k) {

        // int sum=0;
        int count=0;

        for(int e=0;e<arr.length;e++){

            int sum=0;

            sum+=arr[e];
            if(sum==k){
                count++;
            }
           for(int s=e+1;s<arr.length;s++){
            sum+=arr[s];
            if(sum==k){
                count++;
            }
           }
        }
        return count;
    }
}