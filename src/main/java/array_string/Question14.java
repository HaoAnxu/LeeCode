package array_string;

import java.lang.reflect.Array;

/**
 * 【134.加油站】
 *
 * 在一条环路上有 n 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
 * 你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。
 * 你从其中的一个加油站出发，开始时油箱为空。
 * 给定两个整数数组 gas 和 cost ，如果你可以按顺序绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1 。
 * 如果存在解，则 保证 它是 唯一 的。
 *
 * @Author: haoanxu
 * @Date: 2025/12/17
 */
public class Question14 {

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int oil = 0;
        int total = 0;
        for (int i = 0; i < gas.length; i++) {
            oil += gas[i]-cost[i];
            total += gas[i]-cost[i];
            if(oil < 0){
                //从start到i之间的所有加油站，都不可能是有效起点
                start = i+1;
                oil = 0;
            }
        }
        if(total<0){
            return -1;
        }else {
            return start;
        }
    }
    private static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
