class Solution {
    public int getLucky(String s, int k) {
         int sum=0;
    
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            int asci = (int) character;
             int ans= asci-96;
            sum+=ans%10;
            ans/=10;
            sum+=ans;
        }
        k--;
     while(k>0){
        int p=sum;
        sum=0;
            while(p>0){
                sum+=p%10;
                  p/=10;   
            }
    
        k--;
        }
        return sum;
            
    }
}