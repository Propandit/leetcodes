class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        
		// Initialize each array as a set
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
        
		// For each distinct number in array 1, we check if that number is contained in array 2.
		// If it is, we know that number is not unique to either set, therefore we can remove it from set 2.
		// If the number isn't found in set 2, we know it is unique to set 1, and we can add it to our result.
        for (int n : list1) {
            if (list2.contains(n)) {
                list2.remove(n);
            } else {
                unique1.add(n);
            }
        }
        
		// All remaining numbers in set 2 weren't in set 1, so they are uniqe to array 2.
        for (int n : list2) {
            unique2.add(n);
        }
        
        result.add(unique1);
        result.add(unique2);
        
        return result;
    }
}