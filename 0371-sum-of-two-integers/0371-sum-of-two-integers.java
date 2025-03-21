class Solution {
    public int getSum(int a, int b) {
        if(b ==0){
            return a;
        }
       int carry = (a & b) << 1;
        return getSum((a ^ b), carry);
    }
}