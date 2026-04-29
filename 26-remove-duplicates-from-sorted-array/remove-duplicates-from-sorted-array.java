class Solution {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        int slow=0,fast=0;
        while(fast<n-1){
           if(arr[fast]!=arr[fast+1]){
            arr[slow]=arr[fast];
            slow++;
            }
            fast++;
        }
        arr[slow]=arr[n-1];
        return slow+1;
    }
}