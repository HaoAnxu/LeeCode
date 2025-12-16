package array_string;

import java.util.Arrays;
/**
 * 【轮转数组】
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 *
 * @Author: haoanxu
 * @Date: 2025/12/16
 */
public class Question6 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        rotate1(arr,k);
    }

    //一
    public static void rotate1(int[] nums, int k) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < arr.length; i++) {
            nums[(i+k)%(nums.length)] = arr[i];
        }
    }
    //二
    public static void rotate2(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-1-k);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
