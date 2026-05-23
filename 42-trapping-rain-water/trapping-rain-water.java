class Solution {
    public int trap(int[] h) {
        int left_max=-1,right_max=-1,total=0,left=0,right=h.length-1;
        while(left<right){
            if(h[left]<h[right]){
                if(h[left]>left_max){
                    left_max=h[left];
                }else{
                    total+=left_max-h[left];
                }
                left++;
            }else{
                if(h[right]>right_max){
                    right_max=h[right];
                }else{
                    total+=right_max-h[right];
                }
                right--;
            }
        }
        return total;
    }
}