class Solution {
    public int threeSumClosest(int[] nums, int target) {
       int n=nums.length;
       Arrays.sort(nums);
       int closet=0,diff=Integer.MAX_VALUE;
       for(int i=0;i<n-1;i++){
        int left=i+1,right=n-1;
        while(left<right){
            int sum=nums[i]+nums[left]+nums[right];
            if(Math.abs(target-sum)<diff){ //update closet 
                diff=Math.abs(target-sum);
                closet=sum;
                // right--;
            }
            if(sum<target){  // move based on min 
                left++;  
            }else{
                right--; // move when sum max
            }
        }
       }
       return closet;
    }
}