package array_string;

/**
 * 【多数元素】
 *
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * @Author: haoanxu
 * @Date: 2025/12/16
 */
public class Question5 {

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        int number = nums[0];
        int times = 1;
        for (int i = 1; i < nums.length; i++) {
            if(times == 0){
                number = nums[i];
                times = 1;
            }else if(nums[i] == number){
                times++;
            }else {
                times--;
            }
        }
        return number;
    }
}
