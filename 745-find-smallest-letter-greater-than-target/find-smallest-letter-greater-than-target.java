class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int si=0,li=arr.length-1;
        char ch=arr[0];
        while(si<=li){
            int mid=(si+li)/2;
            if(arr[mid]>target){
                ch=arr[mid];
                li--;
            }else{
                si++;
            }
        }
        return ch;
    }
}