class Solution {
    public boolean valid(int[] weights,int days , int capacity){
        int n=weights.length;
        int loaded=0;
        int useddays=1;
        for(int i=0;i<n;i++){
            if(loaded+weights[i]<=capacity){
                loaded+=weights[i];
            }else{
                useddays++;
                loaded=weights[i];
            }
        }
        return useddays<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int i=0;i<weights.length;i++){     
            left = Math.max(left, weights[i]);
            right += weights[i];
        }
            while(left<=right){
                int m=left+(right-left)/2;
                if(valid(weights,days,m)){
                  right=m-1;  
                }else{
                    left=m+1;
                }
            }
        return left;
    }
}