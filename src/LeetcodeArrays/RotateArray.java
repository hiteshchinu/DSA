package LeetcodeArrays;

public class RotateArray {
    class Solution {
        public void rotate(int[] nums, int k) {
    
            int n = nums.length;
    
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[(i+k)%n] = nums[i];
            }
    
            for (int i = 0; i < n; i++) {
                nums[i] = arr[i];
            }
        }
    }



    // class Solution {
    //     public void rotate(int[] nums, int k) {
    //     k %= nums.length;
    //     reverse(nums, 0, nums.length - 1);
    //     reverse(nums, 0, k - 1);
    //     reverse(nums, k, nums.length - 1);
    // }
    
    // public void reverse(int[] nums, int start, int end) {
    //     while (start < end) {
    //         int temp = nums[start];
    //         nums[start] = nums[end];
    //         nums[end] = temp;
    //         start++;
    //         end--;
    //     }
    // }
    // }

}
