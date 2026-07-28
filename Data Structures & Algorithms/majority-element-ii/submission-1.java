// class Solution {
//     public List<Integer> majorityElement(int[] arr) {
//         Arrays.sort(arr);
//         List<Integer> list=new ArrayList<>();
//         int count=0;
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i] == arr[i+1]){
//                 count++;
//             }else{
//                 if(count > n/3){

//                 }
//             }
//         }
//     }
// }
class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n=arr.length;
        List<Integer> list=new ArrayList<Integer>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int x: arr){
                map.put(x,map.getOrDefault(x,0) +1);
        }
        for(int key : map.keySet()){
            if(map.get(key) > n/3){
                list.add(key);
            }
        }
        return list;
    }
}