class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
      Arrays.sort(target);
      Arrays.sort(arr);
      if(arr.length != target.length){
        return false;
      }
      return Arrays.equals(target,arr);
}}