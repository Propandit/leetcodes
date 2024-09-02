class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int l=chalk.length;
        long count=0;
        for(int num: chalk){
           count+=num; 
        }
        int total=(int)(k%count);
        for(int i=0;i<l;i++){
            if(total<chalk[i]){
                return i;
            }
            total-=chalk[i];
        }
        return 0;
    }
}