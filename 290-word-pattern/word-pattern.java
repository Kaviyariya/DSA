class Solution {
    public boolean wordPattern(String pattern, String s) {
        char ch[]=pattern.toCharArray();
        String str[]=s.split(" ");
        if(ch.length!=str.length){
            return false;
        }
        Map<Character,String> map=new HashMap<Character,String>();
        for(int i=0;i<ch.length;i++){
            boolean contains=map.containsKey(ch[i]);
            if(map.containsValue(str[i])&&!contains){
                return false;
            }
            else if(contains && !map.get(ch[i]).equals(str[i])){
                return false;
            }else{
                map.put(ch[i],str[i]);
            }
        }
        return true;
    }
}