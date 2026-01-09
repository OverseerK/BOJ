import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Util {

    void utils() throws IOException {
        String[] s = new String[0];
        int[] ints = Stream.of(s).mapToInt(Integer::parseInt).toArray();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] in = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        StringBuilder sb = new StringBuilder();
        sb.append("\n");

        //최대최소(여러개)
//        int max = dp[n - 2][0];
//        ArrayList<Integer> can = new ArrayList<>(Arrays.asList(dp[n - 2][1], dp[n - 1][0], dp[n - 1][1]));
//        for (int x : can) {
//            max = Math.max(max, x);
//        }
    }

    void bfbw() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bf.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("");
        bw.flush();
        bw.close();
    }

    static int fac(int a, int b) {
        int r = 1;
        for (int i = a; i <= b; i++) {
            r *= i;
        }
        return r;
    }

    static int binarySearch(int[] a, int n) {
        int lo = 0;
        int hi = a[n - 1];
        while (lo + 1 < hi) {
            int mid = (lo + hi) / 2;
            if (check(a, mid)) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    //DP 기본 포맷
    static int run(int n) {
        int[] dp = new int[n + 1];
        if (n >= 2) dp[2] = 1;
        if (n >= 3) dp[3] = 1;
        for (int i = 4; i <= n; i++) {
            //do something
            dp[i] = 0;
        }
        return dp[n];
    }

    static boolean check(int[] a, int mid) {
        return true;
    }

    static long mod;

    static long[][] matrixMult(long[][] a, long[][] b, int m, int n, int k) {
        long[][] res = new long[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                for (int h = 0; h < m; h++) {
                    res[i][j] += a[i][h] * b[h][j] % mod;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                res[i][j] %= mod;
            }
        }
        return res;
    }

    static long[][] matrixPow(long[][] a, long b, int n) {
        if (b == 0 || b == 1) {
            return a;
        } else {
            long[][] x = matrixPow(a, b / 2, n);
            if (b % 2 == 0) {
                return matrixMult(x, x, n, n, n);
            } else {
                return matrixMult(matrixMult(x, x, n, n, n), a, n, n, n);
            }
        }
    }

}