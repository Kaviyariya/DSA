class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i-1];
                k++;
            }else{
                continue;
            }
        }
        nums[k++]=nums[nums.length-1];
        return k;
    }
}