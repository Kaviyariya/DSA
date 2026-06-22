class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        int res=0;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("-")){
               int n2=(!st.isEmpty()?st.pop():0);
                int n1=(!st.isEmpty()?st.pop():0);
                res=n1-n2;
                st.push(res);
            }else if(tokens[i].equals("/")){
                int n2=(!st.isEmpty()?st.pop():0);
                int n1=(!st.isEmpty()?st.pop():0);
                res=n1/n2;
                st.push(res);
            }else if(tokens[i].equals("*")){
                int n2=(!st.isEmpty()?st.pop():0);
                int n1=(!st.isEmpty()?st.pop():0);
                res=n1*n2;
                st.push(res);
            }else if(tokens[i].equals("+")){
                int n2=(!st.isEmpty()?st.pop():0);
                int n1=(!st.isEmpty()?st.pop():0);
                res=n1+n2;
                st.push(res);
            }else{
                int n=Integer.parseInt(tokens[i]);
                st.push(n);
            }
        }
        return st.pop();
    }
}