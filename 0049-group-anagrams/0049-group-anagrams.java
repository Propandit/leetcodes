class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> anagram = new HashMap<>();

    for (String str : strs) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      String key = String.valueOf(chars);
      anagram.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
    }

    return new ArrayList<>(anagram.values());
  }
}