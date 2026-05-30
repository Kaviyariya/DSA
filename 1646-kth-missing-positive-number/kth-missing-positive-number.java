class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int si=0,li=arr.length-1;
        while(si<=li){
            int mid=(si+li)/2;
            if((arr[mid]-mid)-1<k){
                si=mid+1;
            }else{
                li=mid-1;
            }
        }
        return si+k;
        
    }
}