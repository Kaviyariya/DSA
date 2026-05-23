class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int right[]=new int[n];
        right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*nums[i];
        }
        int l=1;
        for(int i=0;i<n;i++){
            int temp=nums[i];
            int r=(i+1<=n-1)?right[i+1]:1;
            nums[i]=l*r;
            l*=temp;
        }
        return nums;
    }
}