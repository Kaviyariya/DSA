class Solution {
    public String minWindow(String s, String t) {
        int si=0,min=Integer.MAX_VALUE,format=0;
        String res="";
       if(s.length()<t.length()){
        return "";
       }
       HashMap<Character,Integer> map=new HashMap<>();
       HashMap<Character,Integer> window=new HashMap<>();
       for(char ch:t.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       for(int li=0;li<s.length();li++){
        char ch=s.charAt(li);
        window.put(ch,window.getOrDefault(ch,0)+1);
        if(map.containsKey(ch)&&window.get(ch).intValue()==map.get(ch).intValue()){
            format++;
        }
        while(format==map.size()){
            if(li-si+1<min){
                min=li-si+1;
                res=s.substring(si,li+1);
            }
            char left=s.charAt(si);
            window.put(left,window.get(left)-1);
            if(map.containsKey(left)&&window.get(left)<map.get(left)){
                format--;
            }
            si++;
        }
       }
       return res;
    }
}