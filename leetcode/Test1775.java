package leetcode;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Test1775 {
    public static void main(String[] args) {
        Solution1775 solution1775 = new Solution1775();
        solution1775.minOperations(new int[]{1,2,3,4,5,6},new int[]{1,1,2,2,2,2});
    }
}
class Solution1775 {
    public int minOperations(int[] nums1, int[] nums2) {
        int s1 = Arrays.stream(nums1).sum();
        int s2 = Arrays.stream(nums2).sum();
        if (s1 == s2) {
            return 0;
        }
        if (s1 > s2) {
            return minOperations(nums2, nums1);
        }
        int d = s2 - s1;
        int[] arr = new int[nums1.length + nums2.length];
        int k = 0;
        for (int v : nums1) {
            arr[k++] = 6 - v;
        }
        for (int v : nums2) {
            arr[k++] = v - 1;
        }
        Arrays.sort(arr);
        for (int i = 1, j = arr.length - 1; j >= 0; ++i, --j) {
            d -= arr[j];
            if (d <= 0) {
                return i;
            }
        }
        return -1;
    }
}

