package archive.Silver.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class S11053X2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int opt = 0;
        for (int k = 1; k < n; k++) {
            int[] dp = new int[n];
            int bef = 0;
            int max = arr[k - 1];
            dp[k - 1] = 1;
            for (int i = k; i < n; i++) {
                int cur = arr[i];
                if (cur > max) {
                    dp[i] = dp[i - 1] + 1;
                    bef = max;
                    max = cur;
                } else {
                    dp[i] = dp[i - 1];
                    if (cur > bef) {
                        max = cur;
                    }
                }
            }
            if (dp[n - 1] > opt) {
                opt = dp[n - 1];
            }
        }
        System.out.println(opt);
    }

}