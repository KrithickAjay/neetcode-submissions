class Solution {
    public int longestConsecutive(int[] arr) {
        
        Set<Integer> set=new HashSet<>();
        for(int x : arr){
            set.add(x);
        }
        int longest=0;
        for(int x : set){

            if(!set.contains(x-1)){
                int current=x+1;
                int count=1;

                while(set.contains(current)){
                    current++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }



        return longest;
    }
}
