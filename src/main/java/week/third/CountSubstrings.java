package week.third;

/**
 * @Description
 * @ClassName CountSubstrings
 * @Author Xander Sui
 * @Date 2021/3/22
 */
public class CountSubstrings {
    public static int countSubstrings(String s) {
        // 动态规划法
        boolean[][] dp = new boolean[s.length()][s.length()];
        int ans = 0;

        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i <= j; i++) {
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    ans++;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("ababa"));
    }
}
