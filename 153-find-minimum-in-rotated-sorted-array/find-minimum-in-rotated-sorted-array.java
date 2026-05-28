class Solution {
    public int findMin(int[] nums) {
        int si=0,li=nums.length-1;
        while(si<li){
            int mid=(si+li)/2;
            if(nums[mid]>=nums[li]){
                si=mid+1;
            }else{
                li=mid;
            }
        }
        return nums[si];
    }
}