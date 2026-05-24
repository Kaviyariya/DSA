class Solution {
    public int findMin(int[] arr) {
        int si=0,li=arr.length-1;
        while(si<li){
            int mid=(si+li)/2;
            if(arr[mid]>arr[li]){
                si=mid+1;
            }else{
                li=mid;
           }
        }
        return arr[si];
    }
}