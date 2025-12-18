package array_string;

import java.util.List;

/**
 * 【238.除自身以外数组的乘积】
 * <p>
 * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
 * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
 * 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
 *
 * @Author: haoanxu
 * @Date: 2025/12/17
 */
public class Question13 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] result = productExceptSelf(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        //正向遍历
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        //反向遍历
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * suffix;
            suffix *= nums[i];
        }
        return answer;
    }

    public static int[] productExceptSelf_de(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        for (int index = 0; index < n; index++) {
            int product = 1;
            for (int i = 0; i < n; i++) {
                if (i != index) {
                    product *= nums[i];
                }
            }
            answer[index] = product;
        }
        return answer;
    }
}
