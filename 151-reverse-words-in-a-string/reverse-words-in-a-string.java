class Solution {
    public String reverseWords(String st) {
        st=st.trim().replaceAll("\\s+"," ");
        String str[]=st.split(" ");
        int i=0,j=str.length-1;
        while(i<j){
            String temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        String str1=String.join(" ",str);
        return str1;
    }
}