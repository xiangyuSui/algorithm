package week.first;

/**
 * @Description
 * @ClassName RemoveDuplicates
 * @Author Xander Sui
 * @Date 2021/3/12
 */
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int j = 0;
        int i = 1;
        while (i < nums.length) {
            if (nums[j] != nums[i]) {
                nums[j + 1] = nums[i];
                j++;
            }
            i++;
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] num = {1,2,2,2,3};
        System.out.println(removeDuplicates(num));
    }
}
