package sf;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yaokoo
 * @create 2022/7/18 9:34
 */

//两数之和
public class Test08 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,4,8,9};
        int[] solution=solution1(nums,10);
        for(int s:solution){
            System.out.println(s);
        }
    }
    //暴力解法 遍历两次（一次循环数组里的内容，一次循环当前循环数与之对应的和）
    public static int[] solution(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
    //遍历一次 使用map存储下标和元素
    public static int[] solution1(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
