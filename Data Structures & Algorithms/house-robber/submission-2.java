class Solution {
    public int rob(int[] arr) {
        if(arr.length==1) return arr[0];
        if(arr.length == 2) return Math.max(arr[0],arr[1]);
        int n=arr.length;
        int[] freq=new int[n];
        freq[0]=arr[0];
        freq[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            freq[i]=Math.max(arr[i] + freq[i-2],freq[i-1]);
        }
        return freq[n-1];
    }
}
