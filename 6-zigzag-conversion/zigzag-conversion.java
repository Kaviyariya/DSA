class Solution {
    public String convert(String s, int n) {
        String res="";
        if(n==1 || n>=s.length()) return s;
        // for(int i=0;i<n;i++){
        //     if(i==1){
        //         for(int j=i;j<s.length();j++){
        //             res+=s.charAt(j);
        //             j=j+1;
        //         }
        //     }else{
        //         for(int j=i;j<s.length();j++){
        //             res+=s.charAt(j);
        //             j+=n;
        //         }
        //     }
        //     System.out.println(res);
        // }
        // return res;
        // if(n==1 || n>s.length()) return s;
        List<List<Character>>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        int d=1,j=0;
        for(int i=0;i<s.length();i++){
            list.get(j).add(s.charAt(i));
            if(j==0){
                d=1;
            }
            if(j==n-1){
                d=-1;
            }
            j+=d;
        }
        for(int i=0;i<n;i++){
            for(int k=0;k<list.get(i).size();k++){
                res+=list.get(i).get(k);
            }
        }
        return res;
    }
}