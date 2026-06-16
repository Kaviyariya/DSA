class Solution {
    public int largestRectangleArea(int[] h) {
        Stack<Integer>st=new Stack<>();
        int n=h.length;
        int max=0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&h[i]<h[st.peek()]){
                int hi=h[st.pop()];
                int r=i;
                int l=(st.isEmpty())?-1:st.peek();
                int w=r-l-1;
                max=Math.max(max,hi*w);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int hi=h[st.pop()];
            int r=n;
            int l=(st.isEmpty())?-1:st.peek();
            int w=r-l-1;
            max=Math.max(max,hi*w);
        }
        return max;
    }
}