class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length, current_count = 1, result = 0;
        
        // Loop up to n + k - 2 (circular array)
        for (int i = 0; i < n + k - 2; ++i) {
            if (colors[i % n] != colors[(i + 1) % n]) {
                current_count++;
            } else {
                current_count = 1;
            }
            result += (current_count >= k) ? 1 : 0;
        }
        
        return result;
    }
}