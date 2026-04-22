class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]={-1,-1};
        int si=0,li=nums.length-1;
        while(si<=li){
            int mid=(si+li)/2;
            if(nums[mid]==target){
                arr[0]=mid;
                li--;
            }else if(nums[mid]<target) si++;
            else li--;
        }
        si=0;
        li=nums.length-1;
        while(si<=li){
            int mid=(si+li)/2;
            if(nums[mid]==target){
                arr[1]=mid;
                si++;
            }else if(nums[mid]<target) si++;
            else li--;
        }
        return arr;
    }
}