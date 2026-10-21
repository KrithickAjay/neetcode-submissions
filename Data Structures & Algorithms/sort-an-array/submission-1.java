class Solution {
    public int[] sortArray(int[] arr) {
        mergeSort(arr,0,arr.length-1);
        return arr;
    }

    public void mergeSort(int[] arr,int left,int right){

        if(left >= right){
            return;
        }

        int mid = (left+right) /2;

        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    public void merge(int[] arr,int left,int mid,int right){
        

        int[] temp = new int[right-left+1];

        int l =left;
        int r = mid+1;
        int k=0;
        while(l <= mid && r <= right){
            if(arr[l] <= arr[r]){
                temp[k++] = arr[l++];
            }else{
                temp[k++] = arr[r++];
            }
        }

        while(l <= mid){
            temp[k++] = arr[l++];
        }
        while(r <= right){
            temp[k++] = arr[r++];
        }

        for(int p=0;p<temp.length;p++){
            arr[p+left] = temp[p];
        }
    }
}