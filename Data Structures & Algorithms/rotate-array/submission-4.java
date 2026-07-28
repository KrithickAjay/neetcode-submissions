class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        k=k%n;

        // reverse whole array
        reverse(arr,0,n-1);

        //  reverse first k elements
        reverse(arr,0,k-1);

        //  reverse last n-k elements
        reverse(arr,k,n-1);

    }
    public void reverse(int[] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}