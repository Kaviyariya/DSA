class Solution {
    public int majorityElement(int[] arr) {
        int candidates=arr[0],count=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                candidates=arr[i];
            }if(arr[i]==candidates) count++;
            else count--;
        }
        return candidates;
    }
}