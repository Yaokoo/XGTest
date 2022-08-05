package gyj.array;

/**
 * @author yaokoo
 * @create 2022/8/5 19:20
 */
public class SearchInsert {
    public static void main(String[] args) {
        System.out.println(solution1(new int[]{1, 4, 7, 9, 11}, 7));
    }
    public static int solution1(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>=target){
                return i;
            }
        }
        return  nums.length;
    }

    public static int solution(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int middle=left+((right-left)/2);
            if (nums[middle]<target){
                left=middle+1;
            }else if (nums[middle]>target){
                right=middle-1;
            }else {
             return middle;
            }
        }
        return right+1;
    }
}
