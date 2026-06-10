class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int s=0,max=0;
        for(int num:set){
            if(!set.contains(num-1)){
                s=num;
                int count=0;
            while(set.contains(num++)){
                count++;
            }
            max=Math.max(max,count);
            }
        }
        return max;
    }
}