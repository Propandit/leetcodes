class Solution {
   public int rob(int[] num) {
    int rob = 0; 
    int notrob = 0; 
    for(int i=0; i<num.length; i++) {
        int currob = notrob + num[i];
          notrob = Math.max(notrob, rob); 
               rob = currob;
    }
    return Math.max(rob, notrob);
}}