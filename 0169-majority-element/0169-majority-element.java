class Solution {
    public int majorityElement(int[] nums) {
      HashMap<Integer,Integer>map=new HashMap<>();
        for(int num :nums){
            // if(map.containsKey(num)){
                map.put(num,map.getOrDefault(num,0)+1);          
                //  }
                //  else{
                //     map.put(num,1);
                //  }
                if(map.get(num)>nums.length/2) return num;
        }
        return 0;
    
    }
}