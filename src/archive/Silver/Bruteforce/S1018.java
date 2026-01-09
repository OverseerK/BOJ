package archive.Silver.Bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class S1018 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] in = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = in[0];
        int m = in[1];
        int minres = Integer.MAX_VALUE;

        char[][] board = new char[n][m];
        for (int a = 0; a < n; a++) {
            board[a] = bf.readLine().toCharArray();
        }
        for (int a = 0; a <= n - 8; a++) {
            for (int b = 0; b <= m - 8; b++) {
                int cnt = 0;
                for (int i = 0; i < 8; i++) {
                    boolean shouldWhite = i % 2 == 0;
                    for (int j = 0; j < 8; j++) {
                        if (board[a + i][b + j] == 'W') {
                            if (!shouldWhite) {
                                cnt++;
                            }
                        } else {
                            if (shouldWhite) {
                                cnt++;
                            }
                        }
                        shouldWhite = !shouldWhite;
                    }
                }
                int res = Math.min(cnt, 64 - cnt);
                if (minres > res) {
                    minres = res;
                }

            }
        }
        System.out.println(minres);
    }

}