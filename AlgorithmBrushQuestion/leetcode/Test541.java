package AlgorithmBrushQuestion.leetcode;

public class Test541 {
    public static void main(String[] args) {
        Solution541 solution541 = new Solution541();
        solution541.reverseStr("abcdefg",2);
    }
}
class Solution541{
    public String reverseStr(String s,int k){
        int n = s.length();
        char[] arr = s.toCharArray();
        for(int i = 0;i < n;i += 2 * k){
            reverse(arr,i,Math.min(i + k,n) - 1);
        }
        return new String(arr);
    }
    public void reverse(char[] arr,int left,int right){
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}