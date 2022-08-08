package gyj.array;

/**
 * @author yaokoo
 * @create 2022/8/8 9:13
 */
public class DelIndex {
    public static void main(String[] args) {
        System.out.println(solution1(new int[]{2, 1, 2, 2}, 2));
        System.out.println(solution2(new int[]{2, 1, 2, 2}, 2));
    }
    //暴力
    public static int solution1(int[] nums,int target){
        int size= nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i]==target){
                for (int j = i+1; j <size; j++) {
                    nums[j-1]=nums[j];
                }
                i--;   //移动删除后 第一个for指针要退回（后一个元素已经移动到前一个位置，未检测后一个元素）
                size--;
            }
        }
        return size;
    }

    //双指针
    public static int solution2(int[] nums,int target){
        int fast=0;
        int low=0;
        while (nums.length>fast){ //快指针遍历
            if (nums[fast]==target){ //遇到目标元素 快指针往后移去寻找不同的元素
                fast++;
            }else {  //不是删除元素 快指针的值给慢指针的值达到移动效果 同时两个指针移动
                nums[low]=nums[fast];
                low++;
                fast++;
            }
        }
        return low;    //慢指针的值是数组位重复值的长度
    }
}
