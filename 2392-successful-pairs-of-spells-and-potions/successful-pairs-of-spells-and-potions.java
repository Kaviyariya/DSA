class Solution {
    public int[] successfulPairs(int[] s, int[] p, long scs) {
        int i=0;
        Arrays.sort(p);
        while(i<s.length){
            int si=0,li=p.length-1;
            while(si<=li){
            int mid=(si+li)/2;
            long temp=(long)s[i]*p[mid];
            if(temp>=scs)li=mid-1;
            else si=mid+1;
            }
            s[i]=p.length-si;
            i++;
        }
        return s;
    }
}