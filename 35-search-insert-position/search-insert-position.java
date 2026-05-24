class Solution {
    public int searchInsert(int[] arr, int target) {
        int si=0,li=arr.length-1;
        while(si<=li){
            int mid=(si+li)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target) si=mid+1;
            else li=mid-1;
        }
        return si;
    }
}