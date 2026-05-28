class Solution {
    public int findPeakElement(int[] nums) {
        int si=0,li=nums.length-1;
        while(si<li){
            int mid=(si+li)/2;
            if(nums[mid]<nums[mid+1]) si=mid+1;
            else li=mid;
        }
        return si;
    }
}