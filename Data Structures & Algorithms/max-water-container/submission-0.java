class Solution {
    public int maxArea(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int max=0;
        int area=0;
        while(left< right){
            int length=Math.min(arr[left],arr[right]);
            area=length * (right-left);
            max=Math.max(area,max);
            if(arr[left]<arr[right]) left++;
            else right--;
        }
        return max;
    }
}
