package leetcode;

public class Test88 {
    public static void main(String[] args) {
        Solution88 solution88 = new Solution88();
        solution88.merge(new int[]{0},0,new int[]{1},1);
    }
}
class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;

        for (int k = m + n - 1; k >= 0; k--) {
            if (j < 0 || (i >= 0 && nums1[i] >= nums2[j])) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
        }
    }
}
