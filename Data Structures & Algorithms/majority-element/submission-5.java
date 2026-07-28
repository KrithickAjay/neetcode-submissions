class Solution {
    public int majorityElement(int[] arr) {

        // HashMap<Integer, Integer> map = new HashMap<>();

        // // count frequencies
        // for (int i = 0; i < arr.length; i++) {
        //     map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // }

        // int n = arr.length / 2;

        // // find majority element
        // for (int key : map.keySet()) {
        //     if (map.get(key) > n) {
        //         return key;
        //     }
        // }

        // return -1;


        int count =0;
        int candidate =0;

        for(int num:arr){
            if(count==0){
                candidate=num;
            }
            if(num==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}