class Solution {
    public int findKthLargest(int[] nums, int k) {
        Map<Integer,Integer>map=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.print(map);
        int j=0,ans=0;
        for(int i:map.keySet()){
            ans=i;
            j+=map.get(i);
            if(j>=k) break;
        }
        return ans;
    }
}