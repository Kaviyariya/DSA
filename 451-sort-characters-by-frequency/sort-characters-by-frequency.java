class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        Map<Integer,List<Character>>m1=new TreeMap<>(Collections.reverseOrder());
        for(char i:map.keySet()){
            if(!m1.containsKey(map.get(i))){
                m1.put(map.get(i),new ArrayList<>());
            }
            m1.get(map.get(i)).add(i);
        }
        String res="";
        for(int i:m1.keySet()){
            List<Character>list=m1.get(i);
            for(int j=0;j<list.size();j++){
                for(int k=0;k<i;k++){
                    res+=list.get(j);
                }
            }
        }
        return res;
    }
}