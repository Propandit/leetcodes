class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int l=candies.length;
       int max=0;
       for(int candy:candies){
         max= Math.max(max,candy);
       }
         List<Boolean> result = new ArrayList<>();
        for(int i=0;i<l;i++){
            int sum=0;
           sum=candies[i]+extraCandies;
           if(sum>=max){
            result.add(true);
           }else{
            result.add(false);
           }
        }
        return result;
    }
}