package com.pancm.review;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /*给定一个数组和数字，判断数组内的两个数相加是否等于该数字
    * 如果等于，则打印出数组下标
    * */
    public static void getTwoSum(int []nums,int sum)
    {
        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int subNum = sum - nums[i];
            if(map.containsKey(subNum)) {
                System.out.println(map.get(subNum)+","+i);
            }
            map.put(nums[i],i);
        }
    }

    public static void main(String[] args) {

        int nums[] = {2,3,5,1,7,9};
        TwoSum.getTwoSum(nums,6);

    }
}
