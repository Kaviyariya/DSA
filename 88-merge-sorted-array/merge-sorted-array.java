class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0&&n==0) return;
        if(n==0) return;
        int i=0,j=0;
        ArrayList<Integer>list=new ArrayList<>();
        while(i<m&&j<n){
            int x=nums1[i];
            if(nums1[i]<nums2[j]){
               list.add(nums1[i]);
               i++;
            }else{
                list.add(nums2[j]);
                j++;
            }
        }
        while(i<m){
            list.add(nums1[i]);
            i++;
        }
         while(j<n){
            list.add(nums2[j]);
            j++;
        }
        for(int k=0;k<list.size();k++){
            nums1[k]=list.get(k);
        }
    }
}