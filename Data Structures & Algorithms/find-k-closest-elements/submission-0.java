class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list=new ArrayList<>(k);
        
        int left=0;
        int right=arr.length-1;
       while(right-left+1>k){
        int ax=Math.abs(arr[left] - x);
        int bx=Math.abs(arr[right] - x);

        if(ax > bx){
            left++;
        }else{
            right--;
        }
       }

       for(int i=left;i<=right;i++){
        list.add(arr[i]);
       }
        return list;
    }
}