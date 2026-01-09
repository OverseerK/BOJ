package archive.Silver.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class S9465 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(bf.readLine());
        for (int c = 0; c < tc; c++) {
            int n = Integer.parseInt(bf.readLine());
            int[][] in = new int[2][n];
            for (int i = 0; i < 2; i++) {
                in[i] = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }
            int[][] stk = new int[n][2];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < n; j++) {
                    stk[j][i] = in[i][j];
                }
            }
            int[][] dp = new int[n][2];
            dp[0] = stk[0];
            if (n == 1) {
                System.out.println(Math.max(dp[0][0], dp[0][1]));
                continue;
            }
            dp[1][0] = dp[0][1] + stk[1][0];
            dp[1][1] = dp[0][0] + stk[1][1];
            for (int i = 2; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    if (j == 0) {
                        dp[i][j] = Math.max(Math.max(dp[i - 2][0], dp[i - 2][1]), dp[i - 1][1]);
                    } else {
                        dp[i][j] = Math.max(Math.max(dp[i - 2][0], dp[i - 2][1]), dp[i - 1][0]);
                    }
                    dp[i][j] += stk[i][j];
                }
            }
            System.out.println(Math.max(dp[n - 1][0], dp[n - 1][1]));
        }
    }

}