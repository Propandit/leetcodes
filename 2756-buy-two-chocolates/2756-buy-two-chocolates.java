class Solution {
    public int buyChoco(int[] prices, int money) {
int sum=0;
Arrays.sort(prices);
sum=prices[0]+prices[1];
        if(sum<=money){
            return money-sum;
        }
            return money;
    }
}