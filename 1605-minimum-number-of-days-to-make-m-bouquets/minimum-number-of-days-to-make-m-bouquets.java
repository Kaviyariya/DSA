class Solution {
    static boolean bloom(int arr[], int day, int f, int b) {
        int bou = 0, total = 0;
        for (int i :arr) {
            if (i <= day) {
                bou++;
            } else {
                bou = 0;
            }
            if (bou == f){
                total++;
                bou=0;
            } 
        }
        
        return (total >= b);
    }

    public int minDays(int[] b, int m, int k) {
        int si = Integer.MAX_VALUE, li = 0, ans = -1;
        if(b.length<(long)m*k) return -1;
        for (int i:b) {
            si = Math.min(si, i);
            li = Math.max(li, i);
        }
        while (si <= li) {
            int mid = si+(li - si) / 2;
            if (bloom(b, mid, k, m)) {
                ans = mid;
                li = mid - 1;
            } else
                si = mid + 1;
        }
        return ans;
    }
}