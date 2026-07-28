class Solution {
    public int firstMissingPositive(int[] arr) {

        int n=arr.length;
        int i=0;
        while(i<n){
            int correctIndex=arr[i]-1;
            if(arr[i]>0 && arr[i]<=n && arr[i]!= arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }else{
                i++;
            }}
            for(int j=0;j<n;j++){
                if(j+1 != arr[j]){
                    return j+1;
                }
            }
            return n+1;
        
        // Set<Integer> set=new HashSet<>();
        // for(int x : arr){
        //     if(x>0){
        //         set.add(x);
        //     }
        // } 
        // int num=1;
        // while(set.contains(num)){
        //     num++;
        // }
        // return num;
    }
}