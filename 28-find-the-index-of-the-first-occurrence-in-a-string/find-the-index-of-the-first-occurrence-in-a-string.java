class Solution {
    public int strStr(String str, String target) {
        if(target==null||str.length()==0){
        return 0;
       }
       int st=str.length(),lt=target.length();
       for(int i=0;i<=st-lt;i++){
        int j=0;
        while(j<lt&&str.charAt(i+j)==target.charAt(j)){
            j++;
        }
        if(j==lt){
            return i;
        }
       }
       return -1;
    }
}