class Solution {
    static String rotate(char ch[]){
        int n=ch.length;
        char temp=ch[0];
        for(int i=1;i<n;i++){
            ch[i-1]=ch[i];
        }
        ch[n-1]=temp;
        String str=String.valueOf(ch);
        return str;
    }
    public boolean rotateString(String s, String goal) {
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
           String str=rotate(ch);
            if(str.equals(goal)){
                return true;
            }
        }
        return false;
    }
}