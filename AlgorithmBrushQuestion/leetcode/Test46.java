package AlgorithmBrushQuestion.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test46 {
    public static void main(String[] args) {
        Solution46 solution = new Solution46();
        List<List<Integer>> permute = solution.permute(new int[]{1, 2, 3});
        System.out.println(permute);

    }
}

class Solution46 {

    List<List<Integer>> result = new ArrayList<>();// 存放符合条件结果的集合
    LinkedList<Integer> path = new LinkedList<>();// 用来存放符合条件结果
    boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0){
            return result;
        }
        used = new boolean[nums.length];
        permuteHelper(nums);
        return result;
    }

    private void permuteHelper(int[] nums){
        if (path.size() == nums.length){
            result.add(path);
            return;
        }
        for (int i = 0; i < nums.length; i++){
            if (used[i]){
                continue;
            }
            used[i] = true;
            path.add(nums[i]);
            permuteHelper(nums);
            path.removeLast();
            used[i] = false;
        }
    }
}



