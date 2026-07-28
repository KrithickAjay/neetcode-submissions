class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int[] res=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                res[i]=j-i;
                break;
            }
            
            }
            
        }
        return res;        
    }
}
