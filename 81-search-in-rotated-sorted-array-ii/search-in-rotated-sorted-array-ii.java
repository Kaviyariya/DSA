class Solution {
    public boolean search(int[] arr, int target) {
        int si=0,li=arr.length-1;
        while(si<=li){
            int mid=(si+li)/2;
            if(arr[mid]==target){
                return true;
            }else if(arr[si]<arr[mid]) {
                if(target>=arr[si]&& target<arr[mid]){
                    li=mid-1;
                }else{
                    si=mid+1;
                }
            }
            else if(arr[mid]<arr[li]){
                if(target>arr[mid]&& target<=arr[li]){
                    si=mid+1;
                }else{
                    li=mid-1;
                }
            }else{
                if(arr[si]<=arr[mid]){
                    si++;
                }else{
                    li--;
                }
            }
        }
        return false;
    }
}