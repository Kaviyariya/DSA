class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        int n1=0;
        int n2=0;
        int res=0;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("-")){
               n2=(!st.isEmpty()?st.pop():0);
               n1=(!st.isEmpty()?st.pop():0);
                res=n1-n2;
                st.push(res);
            }else if(tokens[i].equals("/")){
                n2=(!st.isEmpty()?st.pop():0);
                n1=(!st.isEmpty()?st.pop():0);
                res=n1/n2;
                st.push(res);
            }else if(tokens[i].equals("*")){
                n2=(!st.isEmpty()?st.pop():0);
                 n1=(!st.isEmpty()?st.pop():0);
                res=n1*n2;
                st.push(res);
            }else if(tokens[i].equals("+")){
                n2=(!st.isEmpty()?st.pop():0);
                n1=(!st.isEmpty()?st.pop():0);
                res=n1+n2;
                st.push(res);
            }else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}