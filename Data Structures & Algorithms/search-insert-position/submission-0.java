class Solution {
    public int searchInsert(int[] arr, int target) {

        int n=arr.length;
        if(arr[n-1]<target){
                return n;
            }
        
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
            else if(arr[i]>target){
                return i;
           }
        }
        return -1;
    }
}