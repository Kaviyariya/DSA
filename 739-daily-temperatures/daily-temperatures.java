class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        Arrays.fill(arr,0);
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&nums[i]>nums[st.peek()]){
                int a=st.pop();
                arr[a]=i-a;
            }
            st.push(i);
        }
        return arr;
    }
}