class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0,count=0,n=nums.length,pro=1;
        for(int right=0;right<n;right++){
            pro*=nums[right];
            while(pro>=k && left<=right){
                pro=pro/nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}