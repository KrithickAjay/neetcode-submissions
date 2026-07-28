class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n=arr.length;
        int[] res=new int[n];
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()]){
                int prev=stack.pop();
                res[prev]=i-prev;
            }
            stack.push(i);
        }
       
        return res;        
    }
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]<arr[j]){
        //         res[i]=j-i;
        //         break;
        //     }
        //     }
        // }
}
