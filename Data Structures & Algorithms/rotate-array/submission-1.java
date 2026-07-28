class Solution {
    public void rotate(int[] arr, int k) {
        k = k % arr.length;
        int[] ans =new int[arr.length];
        int j=0;
        for(int i=arr.length-k;i<arr.length;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<arr.length-k;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
        
    }
}