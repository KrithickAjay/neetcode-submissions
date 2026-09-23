class Solution {
    public int islandPerimeter(int[][] arr) {
        int perimeter = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == 1){
                    perimeter +=  dfs(arr,i,j-1) + dfs(arr,i,j+1) 
                    + dfs(arr,i-1,j) +dfs(arr,i+1,j);
                }
            }
        }
        return perimeter;
    }

    public int dfs(int[][] arr,int i,int j){
        if(i >= arr.length || j >= arr[0].length || j<0 || i < 0){
            return 1;
        }

        return arr[i][j] == 1 ? 0 : 1;
    }
}