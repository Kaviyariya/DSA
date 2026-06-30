class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character,Integer>map=new HashMap<>();
        int j=0,count=0,n=s.length();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            if(map.size()==3){
                count+=n-i;
            }
            while(map.size()>=3){
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
                if(map.get(s.charAt(j))==0){
                    map.remove(s.charAt(j));
                }
                if(map.size()==3){
                   count+=n-i;
                }
                j++;
            }
        }
        return count;
    }
}