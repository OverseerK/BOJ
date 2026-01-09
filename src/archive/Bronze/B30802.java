package archive.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class B30802 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] ts = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] p = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int tsum = 0;
        for (int i = 0; i <= 5; i++) {
            tsum += (ts[i] / p[0]);
            if (ts[i] % p[0] > 0) {
                tsum++;
            }
        }
        System.out.println(tsum);
        System.out.println(n / p[1] + " " + n % p[1]);
    }

}
