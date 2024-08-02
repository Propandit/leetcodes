class Solution {
    public String reverseWords(String s) {
        String[] r = s.trim().split("\\s+");
        String out="";
        // StringBuilder str=new StringBuilder();
        for(int i=r.length-1;i>0;i--){
           out += r[i] + " ";
        }
return out + r[0];
    }}