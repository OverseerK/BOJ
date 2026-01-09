package archive.Silver.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1463 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        System.out.println(run(n));
    }

    static int run(int n) {
        int[] dp = new int[n + 1];
        if (n >= 2) dp[2] = 1;
        if (n >= 3) dp[3] = 1;
        for (int i = 4; i <= n; i++) {
            int a = dp[i - 1] + 1;
            int b = Integer.MAX_VALUE;
            int c = Integer.MAX_VALUE;
            if (i % 2 == 0) {
                b = dp[i / 2] + 1;
            }
            if (i % 3 == 0) {
                c = dp[i / 3] + 1;
            }
            dp[i] = Math.min(Math.min(a, b), c);
        }
        return dp[n];
    }

}