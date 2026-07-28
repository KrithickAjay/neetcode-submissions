class Solution {
    public int findDuplicate(int[] arr) {
        
        HashSet<Integer> set=new HashSet<>();

        for(int x:arr){            

            if(set.contains(x)){
                return x;               
                }
                set.add(x);
        }
            return -1;

    }
}
