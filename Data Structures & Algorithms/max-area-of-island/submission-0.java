class Solution {
    public int maxAreaOfIsland(int[][] arr) {
        int max = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){

                if(arr[i][j] == 1){
                    int area = dfs(arr,i,j);
                    max = Math.max(area,max);
                }
            }
        }
        return max;
    }

    public int dfs(int[][] arr,int i,int j){
        
        if(i < 0 || i >= arr.length || 
        j >= arr[0].length || j < 0 || arr[i][j] == 0 ){
            return 0;
        }

        arr[i][j] = 0;

        return 1 + dfs(arr,i+1,j)+dfs(arr,i-1,j)+
        dfs(arr,i,j-1)+
        dfs(arr,i,j+1);
    }
}
