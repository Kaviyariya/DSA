class Solution {
    public int candy(int[] rate) {
        int candy[]=new int[rate.length];
        candy[0]=1;
        for(int i=0;i<rate.length-1;i++){
            if(rate[i]<rate[i+1]){
                candy[i+1]=candy[i]+1;
            }else{
                candy[i+1]=1;
            }
        }
        for(int i=rate.length-2;i>=0;i--){
            if(rate[i]>rate[i+1]){
                candy[i]=Math.max(candy[i],candy[i+1]+1);
            }
        }
        int sum=0;
        for(int i=0;i<candy.length;i++){
            sum+=candy[i];
        }
        return sum;
    }
}