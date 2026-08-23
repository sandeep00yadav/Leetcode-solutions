class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int sum=0;
        int count=0;
        map.put(0,1);// prefixsum zero exist 1 before array started.
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int required=sum-k;
            if(map.containsKey(required)){
             count += map.get(required);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}