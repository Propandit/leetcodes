class Solution {
    // public boolean backspaceCompare(String s, String t) {
    //     while(s.contains('#')){
    //         s=s.substring(0,s.indexOf('#')-1)+s.substring(s.indexOf('#')+1,s.length());
    //     }


        public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1;
        int j = T.length() - 1;
        int back;
        while (true) {
            back = 0;
            while (i >= 0 && (back > 0 || S.charAt(i) == '#')) {
                back += S.charAt(i) == '#' ? 1 : -1;
                i--;
            }
            back = 0;
            while (j >= 0 && (back > 0 || T.charAt(j) == '#')) {
                back += T.charAt(j) == '#' ? 1 : -1;
                j--;
            }
            if (i >= 0 && j >= 0 && S.charAt(i) == T.charAt(j)) {
                i--;
                j--;
            } else {
                break;
            }
        }
        return i == -1 && j == -1;
    }
    }
