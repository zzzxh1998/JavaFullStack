package AlgorithmBrushQuestion.leetcode;

import java.util.Arrays;

public class Test581 {
    public static void main(String[] args) {
        Solution581 solution581 = new Solution581();
        solution581.findUnsortedSubarray(new int[]{2,6,4,8,10,9,15});
    }
}
class Solution581 {
    public int findUnsortedSubarray(int[] nums) {
        if (isSorted(nums)) {
            return 0;
        }
        int[] numsSorted = new int[nums.length];
        System.arraycopy(nums, 0, numsSorted, 0, nums.length);
        Arrays.sort(numsSorted);
        int left = 0;
        while (nums[left] == numsSorted[left]) {
            left++;
        }
        int right = nums.length - 1;
        while (nums[right] == numsSorted[right]) {
            right--;
        }
        return right - left + 1;
    }

    public boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

