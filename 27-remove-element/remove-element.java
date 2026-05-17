class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val)list.add(nums[i]);
        }
        int j=0;
        for(j=0;j<list.size();j++){
            nums[j]=list.get(j);
        }
        int k=j;
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
        return k;
    }
}