class Solution {
    public void reverseString(char[] s) {
       int last = s.length - 1;
        for (int i = 0; i < s.length/2; i++) {
            swap(s, i, last);
            last--;
        }
    }
    private void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;  
    }
}