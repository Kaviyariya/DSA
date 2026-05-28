class Solution {
    public int singleNonDuplicate(int[] nums) {
        int si=0,li=nums.length-1;
        while(si<li){
            int mid=(si+li)/2;
            if(mid%2==0){
                if(nums[mid]==nums[mid+1]){
                    si=mid+2;
                }else{
                    li=mid;
                }
            }else{
                if(nums[mid-1]==nums[mid]){
                    si=mid+1;
                }else{
                    li=mid;
                }
            }
        }
        return nums[si];
    }
}