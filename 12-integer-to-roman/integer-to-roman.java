class Solution {
    public String intToRoman(int n) {
        int arr[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String s[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String res="";
        int i=0;
        while(n>0){
            if(n>=arr[i]){
                res+=s[i];
                n-=arr[i];
            }else{
                i++;
            }
        }
        return res;
    }
}