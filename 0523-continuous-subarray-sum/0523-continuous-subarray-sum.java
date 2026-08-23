class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        int sum=0;
        int x=0;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(map.containsKey(rem)){
                if(i-map.get(rem)>=2){// old index aur current index ke    beech kam se kam 2 elements hai ya nhi
                return true;
                }    
             }else{
                map.put(rem,i);
             }
        }
        return false;
    }
}
// 23,2,4,6,7
// running sum
// 0+23%6=5 is 5 in map ----- NO 
// store 5 and index 0  (rem,i)----(5,0)
// move next 23+2%6=1 is 1 in map-----NO
// store 1 and index 1 (1,1) move next 
// 25+4%6=5 is 5 in map -----yes 
//-----------------------------------
// important step
//  now check ki current index jispe 5 rem mila hai aur privious index jispe rem 5 tha unke beech 2 se jada ya 2 ka gap hai 
// if(i-map.get(rem)>=2){
// if yes return true 
// }
// if not (store rem , index of rem);
