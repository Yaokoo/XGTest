package sf;

/**
 * @author yaokoo
 * @create 2022/6/27 10:49
 */
public class Test02 {
    //删除数组重复项 返回没有重复项的值
    public static void main(String[] args) {
        System.out.println(dd(new int[]{0,1,2,2,3,3,4}));
    }
    public static int dd(int[] nums){
        if (nums==null||nums.length==0){
            return 0;
        }
            int p=0;
            int q=1;
            while (q<nums.length){
                if (nums[q]!=nums[p]){//如果相等 快指针往后移动      不相等 快的给慢的后面赋值，然后两个同时往后移
                    nums[p+1]=nums[q];
                    p++;
                }else {
                    q++;  //会判断是否相等 如果他两一样的话 前面的if语句会保证快指正永远比慢指正快
                }
                //总结 ：相同的往后扫略过，找到不相同的放到慢指针的下一个。
            }

        return p+1; //p指针从0开始  返回长度要+1
    }
}
