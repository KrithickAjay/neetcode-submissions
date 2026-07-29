class Solution {
    public int numIslands(char[][] arr) {
        int count=0;
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == '1'){
                    count++;
                    explore(arr,i,j);
                }
            }
        }
        return count;
    }
    public void explore(char[][] arr,int row,int col){
        if(row <0 || col <0 || row == arr.length || col == arr[0].length ||
        arr[row][col] == '0') 
        return;

        arr[row][col] = '0';

        explore(arr,row-1,col);
        explore(arr,row,col-1);
        explore(arr,row+1,col);
        explore(arr,row,col+1);
    }
}