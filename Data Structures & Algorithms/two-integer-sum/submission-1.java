class Solution {
    public int[] twoSum(int[] arr, int target) {
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{-1, -1}

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement) , i};
            }

            map.put(arr[i] , i);
        }
        return new int[]{-1,-1};
    }
}