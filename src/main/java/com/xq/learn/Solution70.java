package com.xq.learn;

/**
 * 爬楼梯：每次只能移动1步或者2步，计算爬到楼梯顶部总共有几种方式
 * @author xiaoqiang
 * @date 2020/4/1 0:21
 */
public class Solution70 {
    /**
     * 使用Dynamic Programming思想来实现
     * @param n 楼梯的高度
     * @return ways
     */
    public int climbStairs(int n) {
        if (n < 2) {
            return 1;
        }
        int first = 1;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            int val = first + second;
            first = second;
            second = val;
        }

        return second;
    }
}
