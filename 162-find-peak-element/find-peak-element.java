class Solution {
    public int findPeakElement(int[] arr) {
        int si=0,li=arr.length-1;
        while(si<li){
            int mid=(si+li)/2;
            if(arr[mid]<arr[mid+1]){
                si=mid+1;
            }else{
                li=mid;
            }
        }
        return si;
    }
}