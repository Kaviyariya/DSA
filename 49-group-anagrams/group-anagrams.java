class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>list=new ArrayList<>();
        Map<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String word=strs[i];
            char ch[]=word.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(word);
        }
        for(String l:map.keySet()){
            list.add(map.get(l));
        }
        return list;
    }
}