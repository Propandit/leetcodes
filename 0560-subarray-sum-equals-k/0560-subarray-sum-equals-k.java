class Solution {
    public int subarraySum(int[] nums, int k) {
 
    Map<Integer,Integer> p = new HashMap();
     p.put(0,1);   
    int ans=0,sum=0;
        
     for(int i=0;i<nums.length;i++){
         sum+=nums[i];
        if(p.containsKey(sum-k)){
            ans+=p.get(sum-k);
        } 
         p.put(sum,p.getOrDefault(sum,0)+1);
     }   
       return ans; 
        
    }
}