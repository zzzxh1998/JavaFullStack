package AlgorithmBrushQuestion.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Test128 {

    public static void main(String[] args) {
        Solution128 solution128 = new Solution128();
        solution128.longestConsecutive(new int[]{100,4,200,1,3,2});
    }
}
class Solution128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}

