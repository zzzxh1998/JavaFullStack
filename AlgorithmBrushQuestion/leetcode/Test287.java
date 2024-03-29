package AlgorithmBrushQuestion.leetcode;

public class Test287 {
    public static void main(String[] args) {
        Solution287 solution287 = new Solution287();
        int duplicate = solution287.findDuplicate(new int[]{3,1,3,4,2});
        System.out.println(duplicate);
    }
}
class Solution287 {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int l = 1, r = n - 1, ans = -1;
        while (l <= r) {
            int mid = (l + r) >> 1;
            int cnt = 0;
            for (int i = 0; i < n; ++i) {
                if (nums[i] <= mid) {
                    cnt++;
                }
            }
            if (cnt <= mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }
}

