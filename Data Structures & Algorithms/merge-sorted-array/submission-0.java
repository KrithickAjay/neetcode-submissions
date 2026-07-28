class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {

        int i=m-1;
        int j=n-1;
        int k=arr1.length-1;

        while(i>=0 && j>=0){
            if(arr1[i]>=arr2[j]) arr1[k--]=arr1[i--];
            else arr1[k--]=arr2[j--];
        }

        while(j>=0)
        arr1[k--]=arr2[j--];

    //     int[] arr=new int[arr1.length];
    //     for(int k=0;k<arr1.length;k++){
    //         arr[k]=arr1[k];
    //     }

    //     int i=0;
    //     int j=0;
    //     int k=0;

    //    while(i<m && j<n){
    //     if(arr[i]<=arr2[j]){
    //         arr1[k++]=arr[i++];
    //     }else{
    //         arr1[k++]=arr2[j++];
    //     }
    //    }

    //    while(i<m){
    //     arr1[k++]=arr[i++];
    //    }
    //    while(j<n){
    //     arr1[k++]=arr2[j++];
    //    }





        
    }
}