package array_string;

import java.util.Arrays;

/**
 * 【274.H指数】
 *
 * 给你一个整数数组 citations ，其中 citations[i] 表示研究者的第 i 篇论文被引用的次数。计算并返回该研究者的 h 指数。
 * 根据维基百科上 h 指数的定义：h 代表“高引用次数” ，一名科研人员的 h 指数 是指他（她）至少发表了 h 篇论文，
 * 并且 至少 有 h 篇论文被引用次数大于等于 h 。如果 h 有多种可能的值，h 指数 是其中最大的那个。
 *
 * @Author: haoanxu
 * @Date: 2025/12/17
 */
public class Question11 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4,5,5,6,2,2,2,2};
        System.out.println(hIndex(nums));
    }
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int H = 0;
        int index = citations.length-1;
        for(int i = index;i>=0;i--){
            if(citations[i]>H){
                H++;
            }else {
                break;
            }
        }
        return H;
    }
}
