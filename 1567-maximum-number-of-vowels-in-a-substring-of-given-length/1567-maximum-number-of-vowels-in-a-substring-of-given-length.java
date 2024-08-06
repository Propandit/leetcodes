class Solution {
    public int maxVowels(String s, int k) {
        String S="aeiou";
        int max=0;
        int count=0;
        for(int i=0;i<k;i++){
            if(S.contains(String.valueOf(s.charAt(i)))){
                count++;
            }
            max=count;

        }
        for(int i=k;i<s.length();i++){
            if(S.contains(String.valueOf(s.charAt(i)))){
            count++;
            }
            if(S.contains(String.valueOf(s.charAt(i-k)))){
                count--;
            }
        max=Math.max(max,count);
        }
        return max;
    }
}