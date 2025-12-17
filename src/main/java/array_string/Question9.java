package array_string;

/**
 * 【55.跳跃游戏】
 *
 * 给你一个非负整数数组 nums ，你最初位于数组的 第一个下标 。数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 判断你是否能够到达最后一个下标，如果可以，返回 true ；否则，返回 false 。
 *
 * @Author: haoanxu
 * @Date: 2025/12/16
 */
public class Question9 {
    public static void main(String[] args) {
        int[] prices = {0};
        System.out.println(canJump(prices));
    }

    public static boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; max < nums.length-1; i++) {
            if(i > max) return false;
            max = Math.max(max, i+ nums[i]);
        }
        return true;
    }

    //baoli
    public static boolean canJump_de(int[] nums) {
        if (nums[0] == 0 && nums.length == 1) {
            return true;
        } else if (nums[0] == 0) {
            return false;
        }
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i <= max) {
                max = Math.max(max, i + nums[i]);
            }else {
                return false;
            }
            if (max >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
