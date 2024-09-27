class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
    
        Set<Integer> list1 = new HashSet<>();
        for (int n : nums1) {
            list1.add(n);
        }
        
        Set<Integer> list2 = new HashSet<>();
        for (int n : nums2) {
            list2.add(n);
        }
        
        List<Integer> unique1 = new ArrayList<>();
        List<Integer> unique2 = new ArrayList<>();
         for (int n : list1) {
            if (list2.contains(n)) {
                list2.remove(n);
            } else {
                unique1.add(n);
            }
        }
        
		 for (int n : list2) {
            unique2.add(n);
        }
        
        result.add(unique1);
        result.add(unique2);
        
        return result;
    }
}