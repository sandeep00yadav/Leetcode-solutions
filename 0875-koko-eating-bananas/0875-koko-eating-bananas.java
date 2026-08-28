class Solution {
    public boolean valid(int[]piles, int h,int k){
        long hours=0;
        for(int i=0;i<piles.length;i++){
            hours+=(piles[i]+ k-1)/k;
        }
    return hours<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
      int left=1;
      int right=0;
      for(int i=0;i<piles.length;i++){
        if(piles[i]>right){
            right=piles[i];
        }
      }
      while(left<=right){
        int m=left+(right-left)/2;
        if(valid(piles,h,m)){
            right=m-1;
        }else{
            left=m+1;
        }
      }
      return left;  
    }
}