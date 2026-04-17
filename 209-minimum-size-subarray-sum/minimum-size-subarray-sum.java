class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,sum=0,max=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                max=Math.min(max,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        if(max==Integer.MAX_VALUE) return 0;
        return max;
    }
}