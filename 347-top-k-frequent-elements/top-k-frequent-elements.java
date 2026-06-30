class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arr[]=new int[100];
        int count=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans[]=new int[k];
        Map<Integer,List<Integer>>m1=new TreeMap<>(Collections.reverseOrder());
        for(int i:map.keySet()){
            if(!m1.containsKey(map.get(i))){
                m1.put(map.get(i),new ArrayList<>());
            }
            m1.get(map.get(i)).add(i);
        }
        int a=0;
        for(int i:m1.keySet()){
            List<Integer>list=m1.get(i);
            for(int j=0;j<list.size();j++){
                if(a<k){
                     ans[a++]=list.get(j);
                }else{
                    break;
                }
            }
        }
        return ans;
    }
}