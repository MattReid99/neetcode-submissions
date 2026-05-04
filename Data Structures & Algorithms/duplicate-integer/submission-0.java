class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int n : nums) {
            if (!set.add(n))
                return true;
        }
        return false;
    }
}