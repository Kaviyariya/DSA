class Solution {
    public int lengthOfLastWord(String s) {
        String ch[]=s.split(" ");
        return ch[ch.length-1].length();
    }
}