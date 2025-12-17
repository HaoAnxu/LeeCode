package array_string;

/**
 * 【45.跳跃游戏II】
 *
 * 给定一个长度为 n 的 0 索引整数数组 nums。初始位置在下标 0。
 * 每个元素 nums[i] 表示从索引 i 向后跳转的最大长度。换句话说，如果你在索引 i 处，你可以跳转到任意 (i + j) 处：
 * 0 <= j <= nums[i] 且
 * i + j < n
 * 返回到达 n - 1 的最小跳跃次数。测试用例保证可以到达 n - 1。
 *
 * @Author: haoanxu
 * @Date: 2025/12/16
 */
public class Question10 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }

    public static int jump(int[] nums) {
        if(nums.length == 1) return 0;
        int times = 0;
        int max = 0;
        int currentMax = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max,i+nums[i]);
            if(currentMax == i){
                times++;
                currentMax = max;
                if(currentMax >= nums.length-1){
                    break;
                }
            }
        }
        return times;
    }
}
