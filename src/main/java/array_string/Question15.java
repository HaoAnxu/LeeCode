package array_string;

/**
 * 【135.分发糖果】
 * <p>
 * n 个孩子站成一排。给你一个整数数组 ratings 表示每个孩子的评分。
 * 你需要按照以下要求，给这些孩子分发糖果：
 * 每个孩子至少分配到 1 个糖果。
 * 相邻两个孩子中，评分更高的那个会获得更多的糖果。
 * 请你给每个孩子分发糖果，计算并返回需要准备的 最少糖果数目 。
 *
 * @Author: haoanxu
 * @Date: 2025/12/17
 */
public class Question15 {
    public static void main(String[] args) {
        int[] ratings = {1, 2, 3, 4, 5, 4, 3};
        System.out.println(candy(ratings));
    }

    public static int candy(int[] ratings) {
        int numbers = 0;
        int[] leftArr = new int[ratings.length];
        int[] rightArr = new int[ratings.length];
        for (int i = 0; i < ratings.length; i++) {
            leftArr[i] = 1;
            rightArr[i] = 1;
        }
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                leftArr[i] = leftArr[i - 1] + 1;
            }
        }
        System.out.println();
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                rightArr[i] = rightArr[i + 1] + 1;
            }
        }
        for (int i = 0; i < ratings.length; i++) {
            numbers += Math.max(leftArr[i], rightArr[i]);
        }
        return numbers;
    }
}
