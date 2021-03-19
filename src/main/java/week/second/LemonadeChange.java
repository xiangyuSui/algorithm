package week.second;

import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @ClassName LemonadeChange
 * @Author Xander Sui
 * @Date 2021/3/19
 */
public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{5,5,5,5,10,20,10,20,20,20};
        System.out.println(lemonadeChange(ints));
    }
}
