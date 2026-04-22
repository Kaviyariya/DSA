class Solution {
    public int searchInsert(int[] nums, int target) {
        int si=0,li=nums.length-1;
        while(si<=li){
            int mid=(si+li)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) si++;
            else li--;
        }
        return si;
    }
}