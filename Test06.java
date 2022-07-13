package sf;

import java.util.Arrays;

/**
 * @author yaokoo
 * @create 2022/6/30 10:24
 */
public class Test06 {
    //找出数组中三个数乘积的最大值
    public static void main(String[] args) {
        System.out.println(threeMax(new int[]{1,-2,3,4,5,6}));
        System.out.println(threeMax1(new int[]{1,-2,3,4,5,6}));
    }
    //1.排序（array.sort） 两种情况 全正 三个最大值 有负 两个最小的和一个最大的 两个比较（math。max）
    public static int threeMax(int[] arr){
        Arrays.sort(arr);
        int n= arr.length;
        int res=Math.max(arr[n-1]*arr[n-2]*arr[3],arr[n-1]*arr[0]*arr[1]);
        return res;
    }
    //2.线性扫描 for if 定义三个最大值 两个最小值 通过if判断找出 然后用mathmax比较
    public static int threeMax1(int[] arr){
        int min1=Integer.MAX_VALUE;int min2=Integer.MAX_VALUE;
        int max1=Integer.MIN_VALUE;int max2=Integer.MIN_VALUE;int max3=Integer.MIN_VALUE;

        for(int x:arr){
            if (x<min1){
                min2=min1;
                min1=x;
            }else if (x<min2){
                min2=x;
            }
            if (x>max1){
                max3=max2;
                max2=max1;
                max1=x;
            }else if (x>max2){
                max3=max2;
                max2=x;
            }else if (x>max3){
                max3=x;
            }
        }
        return Math.max(max1*max2*max3,max3*min1*min2);
    }
}
