class Solution {
    public int[][] transpose(int[][] arr) {
        
        int m=arr.length;
        int n=arr[0].length;

        // for(int i=0;i<m;i++){
        //     for(int j=1;j<m;j++){
        //         int temp=arr[i][j];
        //         arr[i][j]=arr[j][i];
        //         arr[j][i]=temp;
        //     }
        // }

        int[][] matrix =new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[j][i]=arr[i][j];
            }

        }
        return matrix;
    }
}