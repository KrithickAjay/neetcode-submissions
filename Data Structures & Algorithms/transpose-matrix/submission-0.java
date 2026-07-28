class Solution {
    public int[][] transpose(int[][] arr) {
        
        int m=arr.length;
        int n=arr[0].length;
        int[][] mat=new int[n][m];

        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                mat[i][j]=arr[j][i];
            }
        }
        return mat;
    }
}