class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                if(i - map.get(arr[i]) <= k){
                    return true;
                }
            }
            map.put(arr[i],i);
        }
        return false;
        
    }
}
// class Solution {
//     public boolean containsNearbyDuplicate(int[] arr, int k) {

//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                 if(i!=j){
//                 if(arr[i]==arr[j] && (Math.abs(i-j))<=k){
//                     return true;
//                 }}
//             }
//         }
//         return false;
//     }
// }