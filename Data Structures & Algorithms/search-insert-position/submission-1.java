class Solution {
    public int searchInsert(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;

            else if (arr[mid] < target)
                left = mid + 1;

            else
                right = mid - 1;
        }
        return left;
    }
}


// class Solution {
//     public int searchInsert(int[] arr, int target) {

//         int n=arr.length;
//         if(arr[n-1]<target){
//                 return n;
//             }
        
//         for(int i=0;i<n;i++){
//             if(arr[i]==target){
//                 return i;
//             }
//             else if(arr[i]>target){
//                 return i;
//            }
//         }
//         return -1;
//     }
// }

