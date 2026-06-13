class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        long sum=0,max=0;
        int left=0;
        for(int j=0;j<nums.length;j++){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            sum+=nums[j];
            while(j-left+1>k){
                map.put(nums[left],map.get(nums[left])-1);
                sum-=nums[left];
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            if(map.size()==k){
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}