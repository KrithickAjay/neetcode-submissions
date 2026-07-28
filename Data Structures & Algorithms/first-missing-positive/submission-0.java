class Solution {
    public int firstMissingPositive(int[] arr) {
        Set<Integer> set=new HashSet<>();

        for(int x : arr){
            if(x>0){
                set.add(x);
            }
        } 
        int num=1;
        while(set.contains(num)){
            num++;
        }
        return num;
    }
}