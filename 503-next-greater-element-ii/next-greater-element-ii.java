class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        Arrays.fill(arr,-1);
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n*2;i++){
            int a=i%n;
            while(!st.isEmpty()&&nums[a]>nums[st.peek()]){
                arr[st.pop()]=nums[a];
            }
            st.push(a); 
        }
        return arr;
    }
}