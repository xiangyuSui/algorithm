package week.second;

import java.util.Arrays;

/**
 * @Description
 * @ClassName MajorityElement
 * @Author Xander Sui
 * @Date 2021/3/17
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElement2(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate.intValue();
    }
}
