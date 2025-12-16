package array_string;

/**
 * 【删除有序数组种的重复项目II】
 *
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * @Author: haoanxu
 * @Date: 2025/12/16
 */
public class Question4 {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3};
        removeDuplicates(arr);
    }

    public static int removeDuplicates(int[] nums) {
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if(nums[i]!=nums[index-2]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
