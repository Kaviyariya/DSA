class Solution {
    static Map<Character,Integer> map(String str){
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        return map;
    }
    static boolean anagram(Map<Character,Integer>map,String str){
        int count=0;
        Map<Character,Integer>m1=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                m1.put(ch,m1.getOrDefault(ch,0)+1);
            }else{
                return false;
            }
        }
        for(char a:map.keySet()){
            if(map.get(a)!=m1.get(a)){
                return false;
            }
        }
        if(map.size()!=m1.size()) return false;
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        List<List<String>>ans=new ArrayList<>();
        int vis[]=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==-1) continue;
            vis[i]=-1;
            List<String>list=new ArrayList<>();
           list.add(strs[i]);
           Map<Character,Integer>map=map(strs[i]);
           for(int j=i+1;j<n;j++){
            if(vis[j]==-1) continue;
            if(anagram(map,strs[j])){
                vis[j]=-1;
                list.add(strs[j]);
            }
           }
           System.out.println(list);
           ans.add(list);
        }
        return ans;
    }
}