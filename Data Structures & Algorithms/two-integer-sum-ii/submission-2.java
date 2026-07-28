class Solution {
    public int[] twoSum(int[] arr, int target) {
        
        for(int e =0;e<arr.length;e++){
            for(int s=e+1;s<arr.length;s++){
                if(arr[e]+arr[s] == target){
                    return new int[]{e+1,s+1};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
