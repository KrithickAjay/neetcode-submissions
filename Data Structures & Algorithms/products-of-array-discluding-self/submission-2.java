class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];

        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<n;i++){
            left[i] = left[i-1] * arr[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i] = arr[i+1] *right[i+1];
        }
        for(int i=0;i<n;i++){
            arr[i]=left[i]*right[i];
        }
        return arr;
    }
}  
// class Solution {
//     public int[] productExceptSelf(int[] arr) {
//         int[] res=new int[arr.length];
//         for(int i=0;i<arr.length;i++){
//             int pro=1;
//             for(int j=0;j<arr.length;j++){
//                 if(i != j) {
//                     pro*=arr[j];
//                 }
//             }
//             res[i]=pro;
//         }
//         return res;
//     }
// }