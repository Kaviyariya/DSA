class Solution {
    static int end(int start, char ch, String s) {
        int ans = -1;
        for (int i = start; i < s.length(); i++) {
            if (s.charAt(i) == ch)
                ans = i;
        }
        return ans;
    }

    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int j = 0;
        int end = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                end = end(i, s.charAt(i), s);

            }else{
               continue; 
            }
            if (!map.containsKey(s.charAt(i)) & i > max) {
                list.add(max-j+1);
                j = max + 1;
                max = 0;
            }
            if(!map.containsKey(s.charAt(i))){
               map.put(s.charAt(i),end);
            }
            max = Math.max(max, end);
        }
        System.out.println(j+"  "+max);
        if(max-j+1>0){
            list.add(Math.abs(max-j+1));
        }
        return list;
    }
}