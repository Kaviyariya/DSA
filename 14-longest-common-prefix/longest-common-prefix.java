class Solution {
    public String longestCommonPrefix(String[] str) {
        if(str==null||str.length==0){
        return "";
       }
       int n=str.length;
       Arrays.sort(str);
       String str1=str[0];
       String str2=str[n-1];
       int i=0;
       String rev="";
       while(i<str1.length()&&i<str2.length()){
        if(str1.charAt(i)==str2.charAt(i)){
            rev+=str1.charAt(i);
            i++;
        }else{
            break;
        }
       }
       return rev;
    }
}