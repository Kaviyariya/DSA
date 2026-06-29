class Solution {
    static boolean anagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        s1=new String(c1);
        s2=new String(c2);
        return s1.equals(s2);
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
           for(int j=i+1;j<n;j++){
            if(vis[j]==-1) continue;
            if(anagram(strs[i],strs[j])){
                vis[j]=-1;
                list.add(strs[j]);
            }
           }
           ans.add(list);
        }
        return ans;
    }
}