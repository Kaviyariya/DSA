class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<ch1.length;i++){
            boolean contains=map.containsKey(ch1[i]);
            if(contains && (!map.get(ch1[i]).equals(ch2[i]))){
                return false;
            }
            if(!contains && map.containsValue(ch2[i])){
                return false;
            }else{
                map.put(ch1[i],ch2[i]);
            }
        }
        return true;
    }
}