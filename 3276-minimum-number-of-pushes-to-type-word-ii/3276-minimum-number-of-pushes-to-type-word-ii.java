class Solution {
    public int minimumPushes(String word) {
        // return word.length();
      int[] arr=new int[26];
      for(int i=0;i<word.length();++i){
        ++arr[word.charAt(i) - 'a'];
      }
      Arrays.sort(arr);
       int ans = 0;
        for (int i = 0; i < 26; ++i) {
            ans += (i / 8 + 1) * arr[26 - i - 1];
        }
        return ans;
    }
}