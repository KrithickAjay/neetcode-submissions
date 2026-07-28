class Solution {
    public int majorityElement(int[] arr) {


       HashMap<Integer,Integer> map=new HashMap<>();

       for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }
      int n=arr.length/2;
       for(int key : map.keySet()){
        if(map.get(key)>n){
            return key;
        }
       }
       return -1;
        
        
    }
}