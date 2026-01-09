package archive.Silver.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class S1149 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[][] rgb = new int[n][3];
        for (int i = 0; i < n; i++) {
            rgb[i] = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int[][] dp = new int[n][n];
        dp[0] = rgb[0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    dp[i][j] = Math.min(dp[i - 1][1] + rgb[i][j], dp[i - 1][2] + rgb[i][j]);
                } else if (j == 1) {
                    dp[i][j] = Math.min(dp[i - 1][0] + rgb[i][j], dp[i - 1][2] + rgb[i][j]);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][0] + rgb[i][j], dp[i - 1][1] + rgb[i][j]);
                }
            }
        }
        System.out.println(Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2])));
    }

}