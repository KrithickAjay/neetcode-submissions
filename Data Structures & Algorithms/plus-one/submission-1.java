class Solution {
    public int[] plusOne(int[] arr) {
        
         for(int right=arr.length-1;right>=0;right--){
            if(arr[right]<9){
                arr[right]++;
                return arr;
            }

            arr[right]=0;
         }
         int[] ans=new int[arr.length+1];
         ans[0]=1;
         return ans;  
    }
}
