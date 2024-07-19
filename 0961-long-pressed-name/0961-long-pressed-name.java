class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if (name.charAt(0) != typed.charAt(0)) return false;
        int i = 1 , j=1;
        while (i < typed.length()) {
            if (j < name.length() && typed.charAt(i) == name.charAt(j)) {
                i++;
                j++;
            }
            else if (typed.charAt(i) == name.charAt(j - 1)) i++;
            else return false;
        }
        return j == name.length();
    }
}