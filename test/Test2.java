package sf.test;

/**
 * @author yaokoo
 * @create 2022/6/27 11:56
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(dd(new int[]{0,1,1,2,2,3,3}));
    }
    //删除数组中的重复项 返回删除后数组的长度
    //双指针算法
    //定义两个指针（一快一慢） 相同的话快指针就往后移， 不同值的话两个指针同时移动  最后结果返回的是慢指针位置（返回的是数组长度 就是位置+1）
    public static int dd(int[] nums){
        if (nums==null||nums.length==0){
            return 0;
        }
        int p=0;
        int q=1;
        while (q<nums.length){
            if (nums[p]!=nums[q]){
                nums[p+1]=nums[q];
                p++;
            }
            q++;
        }
        return p+1;
    }
}
