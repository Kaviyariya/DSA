class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=(m>0)?m-1:Integer.MIN_VALUE;
        int j=(n>0)?n-1:Integer.MIN_VALUE;
        int k=nums1.length-1;
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
}