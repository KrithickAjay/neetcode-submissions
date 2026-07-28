
class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0) +1);
    }

    List<Integer>[] bucket= new ArrayList[arr.length+1];
    for(int key : map.keySet()){
        int freq=map.get(key);

        if(bucket[freq]== null) {
            bucket[freq]=new ArrayList<>();
        }
        bucket[freq].add(key);
    }
    int j=0;
    int[] res=new int[k];
    for(int i=bucket.length-1;i>=0;i--){
        if(bucket[i] != null && j<k){
            for(int x:bucket[i]){
                res[j++]=x;
            }
        }
    }

    return res;
    
    }}



//     int[] res=new int[k];
//     while(j<k){
//         int max=-1;
//         int maxKey=0;
//         for(int key : map.keySet()){
//         if(map.get(key) > max){
//             max=map.get(key);
//             maxKey=key;
//         } 
//     }
//     res[j++]=maxKey;
//     map.remove(maxKey);

//     }
    
//         return res;
//     }
// }

