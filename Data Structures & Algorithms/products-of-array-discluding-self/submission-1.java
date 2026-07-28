class Solution {
    public int[] productExceptSelf(int[] arr) {
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int pro=1;
            for(int j=0;j<arr.length;j++){
                if(i != j) {
                    pro*=arr[j];
                }
            }
            res[i]=pro;
        }
        return res;
    }
}