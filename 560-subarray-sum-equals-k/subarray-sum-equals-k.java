class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int p[]=new int[n];
        p[0]=nums[0];
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+nums[i];
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            int sum=p[i]-k;
            if(map.containsKey(sum)){
                count+=map.get(sum);
            }
            map.put(p[i],map.getOrDefault(p[i],0)+1);
        }
        return count;
    }
}