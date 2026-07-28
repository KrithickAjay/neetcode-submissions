class Solution {
    public void sortColors(int[] arr) {

        int left=0;
        int right=arr.length-1;
        int mid=0;

        while(mid <= right){
            if(arr[mid]==0){
                int temp = arr[left];
                arr[left]=arr[mid];
                arr[mid]=temp;
                mid++;
                left++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp=arr[right];
                arr[right]=arr[mid];
                arr[mid]=temp;
                right--;
            }
        }
        
    }
}