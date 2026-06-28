class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
       for(int k=0;k<nums.length-1;k++){
        if(k!=0 && nums[k]==nums[k-1]) continue;
        int i=k+1,j=nums.length-1;
         while(i<j){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum==0){
                List<Integer>list=new ArrayList<>();
                list.add(nums[k]);
                list.add(nums[i]);
                list.add(nums[j]);
                ans.add(list);
                while(i<nums.length-1 && nums[i]==nums[i+1]) i++;
                while(j>i && nums[j]==nums[j-1]) j--;
                i++;
                j--;
            }else if(sum<0){
                i++;
            }else j--;
        }
       }
        return ans;
    }
}